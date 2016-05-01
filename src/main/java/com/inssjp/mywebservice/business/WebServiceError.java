
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webServiceError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="webServiceError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_c_error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_d_error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webServiceError", propOrder = {
    "cError",
    "dError"
})
public class WebServiceError {

    @XmlElement(name = "_c_error")
    protected String cError;
    @XmlElement(name = "_d_error")
    protected String dError;

    /**
     * Gets the value of the cError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCError() {
        return cError;
    }

    /**
     * Sets the value of the cError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCError(String value) {
        this.cError = value;
    }

    /**
     * Gets the value of the dError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDError() {
        return dError;
    }

    /**
     * Sets the value of the dError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDError(String value) {
        this.dError = value;
    }

}
