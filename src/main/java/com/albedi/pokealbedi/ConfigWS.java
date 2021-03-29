package com.albedi.pokealbedi;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class ConfigWS {

  @Bean
  public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext appContext) {
    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
    servlet.setApplicationContext(appContext);
    servlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean<>(servlet, "/ws/*");
  }

  @Bean(name = "pokeapi")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema pokeapiSchema) {
    DefaultWsdl11Definition def = new DefaultWsdl11Definition();
    def.setPortTypeName("PokeapiPort");
    def.setLocationUri("/ws");
    def.setTargetNamespace("http://ersoluciones.mx/soap/pokeapi");
    def.setSchema(pokeapiSchema);
    return def;
  }

  @Bean
  public XsdSchema pokeapiSchema() {
    return new SimpleXsdSchema(new ClassPathResource("pokeapi.xsd"));
  }

}
