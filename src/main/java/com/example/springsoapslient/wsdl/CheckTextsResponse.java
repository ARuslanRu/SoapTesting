//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.12 at 04:54:42 PM MSK 
//


package com.example.springsoapslient.wsdl;

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
 *         &lt;element name="ArrayOfSpellResult" type="{http://speller.yandex.net/services/spellservice}ArrayOfSpellResult"/>
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
    "arrayOfSpellResult"
})
@XmlRootElement(name = "CheckTextsResponse")
public class CheckTextsResponse {

    @XmlElement(name = "ArrayOfSpellResult", required = true)
    protected ArrayOfSpellResult arrayOfSpellResult;

    /**
     * Gets the value of the arrayOfSpellResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpellResult }
     *     
     */
    public ArrayOfSpellResult getArrayOfSpellResult() {
        return arrayOfSpellResult;
    }

    /**
     * Sets the value of the arrayOfSpellResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpellResult }
     *     
     */
    public void setArrayOfSpellResult(ArrayOfSpellResult value) {
        this.arrayOfSpellResult = value;
    }

}
