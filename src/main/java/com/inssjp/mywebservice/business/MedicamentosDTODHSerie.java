
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicamentosDTODHSerie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicamentosDTODHSerie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="f_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="h_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gln_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gln_destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="n_remito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="n_factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desde_numero_serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasta_numero_serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuit_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuit_destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_obra_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamentosDTODHSerie", propOrder = {
    "fEvento",
    "hEvento",
    "glnOrigen",
    "glnDestino",
    "nRemito",
    "nFactura",
    "vencimiento",
    "gtin",
    "lote",
    "desdeNumeroSerial",
    "hastaNumeroSerial",
    "idEvento",
    "cuitOrigen",
    "cuitDestino",
    "idObraSocial"
})
public class MedicamentosDTODHSerie {

    @XmlElement(name = "f_evento")
    protected String fEvento;
    @XmlElement(name = "h_evento")
    protected String hEvento;
    @XmlElement(name = "gln_origen")
    protected String glnOrigen;
    @XmlElement(name = "gln_destino")
    protected String glnDestino;
    @XmlElement(name = "n_remito")
    protected String nRemito;
    @XmlElement(name = "n_factura")
    protected String nFactura;
    protected String vencimiento;
    protected String gtin;
    protected String lote;
    @XmlElement(name = "desde_numero_serial")
    protected String desdeNumeroSerial;
    @XmlElement(name = "hasta_numero_serial")
    protected String hastaNumeroSerial;
    @XmlElement(name = "id_evento")
    protected String idEvento;
    @XmlElement(name = "cuit_origen")
    protected String cuitOrigen;
    @XmlElement(name = "cuit_destino")
    protected String cuitDestino;
    @XmlElement(name = "id_obra_social")
    protected String idObraSocial;

    /**
     * Gets the value of the fEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEvento() {
        return fEvento;
    }

    /**
     * Sets the value of the fEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEvento(String value) {
        this.fEvento = value;
    }

    /**
     * Gets the value of the hEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEvento() {
        return hEvento;
    }

    /**
     * Sets the value of the hEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEvento(String value) {
        this.hEvento = value;
    }

    /**
     * Gets the value of the glnOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnOrigen() {
        return glnOrigen;
    }

    /**
     * Sets the value of the glnOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnOrigen(String value) {
        this.glnOrigen = value;
    }

    /**
     * Gets the value of the glnDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnDestino() {
        return glnDestino;
    }

    /**
     * Sets the value of the glnDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnDestino(String value) {
        this.glnDestino = value;
    }

    /**
     * Gets the value of the nRemito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRemito() {
        return nRemito;
    }

    /**
     * Sets the value of the nRemito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRemito(String value) {
        this.nRemito = value;
    }

    /**
     * Gets the value of the nFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNFactura() {
        return nFactura;
    }

    /**
     * Sets the value of the nFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNFactura(String value) {
        this.nFactura = value;
    }

    /**
     * Gets the value of the vencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * Sets the value of the vencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimiento(String value) {
        this.vencimiento = value;
    }

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * Gets the value of the lote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLote() {
        return lote;
    }

    /**
     * Sets the value of the lote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLote(String value) {
        this.lote = value;
    }

    /**
     * Gets the value of the desdeNumeroSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesdeNumeroSerial() {
        return desdeNumeroSerial;
    }

    /**
     * Sets the value of the desdeNumeroSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesdeNumeroSerial(String value) {
        this.desdeNumeroSerial = value;
    }

    /**
     * Gets the value of the hastaNumeroSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHastaNumeroSerial() {
        return hastaNumeroSerial;
    }

    /**
     * Sets the value of the hastaNumeroSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHastaNumeroSerial(String value) {
        this.hastaNumeroSerial = value;
    }

    /**
     * Gets the value of the idEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEvento() {
        return idEvento;
    }

    /**
     * Sets the value of the idEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEvento(String value) {
        this.idEvento = value;
    }

    /**
     * Gets the value of the cuitOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuitOrigen() {
        return cuitOrigen;
    }

    /**
     * Sets the value of the cuitOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuitOrigen(String value) {
        this.cuitOrigen = value;
    }

    /**
     * Gets the value of the cuitDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuitDestino() {
        return cuitDestino;
    }

    /**
     * Sets the value of the cuitDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuitDestino(String value) {
        this.cuitDestino = value;
    }

    /**
     * Gets the value of the idObraSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdObraSocial() {
        return idObraSocial;
    }

    /**
     * Sets the value of the idObraSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdObraSocial(String value) {
        this.idObraSocial = value;
    }

}
