//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.28 a las 08:25:33 PM CST 
//


package mx.ersoluciones.soap.pokeapi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pokemon complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pokemon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abilities" type="{http://ersoluciones.mx/soap/pokeapi}ability" maxOccurs="unbounded"/&gt;
 *         &lt;element name="base_experience" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="held_items" type="{http://ersoluciones.mx/soap/pokeapi}held_item" maxOccurs="unbounded"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="location_area_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokemon", propOrder = {
    "abilities",
    "baseExperience",
    "heldItems",
    "id",
    "name",
    "locationAreaEncounters"
})
public class Pokemon {

    @XmlElement(required = true)
    protected List<Ability> abilities;
    @XmlElement(name = "base_experience", required = true)
    protected BigInteger baseExperience;
    @XmlElement(name = "held_items", required = true)
    protected List<HeldItem> heldItems;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "location_area_encounters", required = true)
    protected String locationAreaEncounters;

    /**
     * Gets the value of the abilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ability }
     * 
     * 
     */
    public List<Ability> getAbilities() {
        if (abilities == null) {
            abilities = new ArrayList<Ability>();
        }
        return this.abilities;
    }

    /**
     * Obtiene el valor de la propiedad baseExperience.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaseExperience() {
        return baseExperience;
    }

    /**
     * Define el valor de la propiedad baseExperience.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaseExperience(BigInteger value) {
        this.baseExperience = value;
    }

    /**
     * Gets the value of the heldItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heldItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeldItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeldItem }
     * 
     * 
     */
    public List<HeldItem> getHeldItems() {
        if (heldItems == null) {
            heldItems = new ArrayList<HeldItem>();
        }
        return this.heldItems;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad locationAreaEncounters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Define el valor de la propiedad locationAreaEncounters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAreaEncounters(String value) {
        this.locationAreaEncounters = value;
    }

}
