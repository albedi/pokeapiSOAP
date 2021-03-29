//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.28 a las 08:25:33 PM CST 
//


package mx.ersoluciones.soap.pokeapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ability complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ability" type="{http://ersoluciones.mx/soap/pokeapi}abilityLink"/&gt;
 *         &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ability", propOrder = {
    "ability",
    "isHidden",
    "slot"
})
public class Ability {

    @XmlElement(required = true)
    protected AbilityLink ability;
    @XmlElement(name = "is_hidden")
    protected boolean isHidden;
    @XmlElement(required = true)
    protected BigInteger slot;

    /**
     * Obtiene el valor de la propiedad ability.
     * 
     * @return
     *     possible object is
     *     {@link AbilityLink }
     *     
     */
    public AbilityLink getAbility() {
        return ability;
    }

    /**
     * Define el valor de la propiedad ability.
     * 
     * @param value
     *     allowed object is
     *     {@link AbilityLink }
     *     
     */
    public void setAbility(AbilityLink value) {
        this.ability = value;
    }

    /**
     * Obtiene el valor de la propiedad isHidden.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Define el valor de la propiedad isHidden.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlot(BigInteger value) {
        this.slot = value;
    }

}
