//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.16 at 03:10:55 PM EET
//


package ua.nure.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://spring.io/guides/gs-producing-web-service}user"/>
 *         &lt;element name="zakaz" type="{http://spring.io/guides/gs-producing-web-service}zakaz"/>
 *         &lt;element name="auto" type="{http://spring.io/guides/gs-producing-web-service}auto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "user",
        "zakaz",
        "auto"
})
@XmlRootElement(name = "postAssignZakazRequest")
public class PostAssignZakazRequest {

    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected Zakaz zakaz;
    @XmlElement(required = true)
    protected Auto auto;

    /**
     * Gets the value of the user property.
     *
     * @return
     *     possible object is
     *     {@link User }
     *
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *     allowed object is
     *     {@link User }
     *
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the zakaz property.
     *
     * @return
     *     possible object is
     *     {@link Zakaz }
     *
     */
    public Zakaz getZakaz() {
        return zakaz;
    }

    /**
     * Sets the value of the zakaz property.
     *
     * @param value
     *     allowed object is
     *     {@link Zakaz }
     *
     */
    public void setZakaz(Zakaz value) {
        this.zakaz = value;
    }

    /**
     * Gets the value of the auto property.
     *
     * @return
     *     possible object is
     *     {@link Auto }
     *
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * Sets the value of the auto property.
     *
     * @param value
     *     allowed object is
     *     {@link Auto }
     *
     */
    public void setAuto(Auto value) {
        this.auto = value;
    }

}
