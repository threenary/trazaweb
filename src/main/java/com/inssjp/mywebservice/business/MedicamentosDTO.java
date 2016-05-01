
package com.inssjp.mywebservice.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicamentosDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicamentosDTO">
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
 *         &lt;element name="numero_serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_obra_social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuit_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuit_destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="n_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="n_postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamentosDTO", propOrder = {
    "fEvento",
    "hEvento",
    "glnOrigen",
    "glnDestino",
    "nRemito",
    "nFactura",
    "vencimiento",
    "gtin",
    "lote",
    "numeroSerial",
    "idObraSocial",
    "idEvento",
    "cuitOrigen",
    "cuitDestino",
    "apellido",
    "nombres",
    "tipoDocumento",
    "nDocumento",
    "sexo",
    "direccion",
    "numero",
    "piso",
    "depto",
    "localidad",
    "provincia",
    "nPostal",
    "fechaNacimiento",
    "telefono"
})
public class MedicamentosDTO {

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
    @XmlElement(name = "numero_serial")
    protected String numeroSerial;
    @XmlElement(name = "id_obra_social")
    protected String idObraSocial;
    @XmlElement(name = "id_evento")
    protected String idEvento;
    @XmlElement(name = "cuit_origen")
    protected String cuitOrigen;
    @XmlElement(name = "cuit_destino")
    protected String cuitDestino;
    protected String apellido;
    protected String nombres;
    @XmlElement(name = "tipo_documento")
    protected String tipoDocumento;
    @XmlElement(name = "n_documento")
    protected String nDocumento;
    protected String sexo;
    protected String direccion;
    protected String numero;
    protected String piso;
    protected String depto;
    protected String localidad;
    protected String provincia;
    @XmlElement(name = "n_postal")
    protected String nPostal;
    @XmlElement(name = "fecha_nacimiento")
    protected String fechaNacimiento;
    protected String telefono;

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
     * Gets the value of the numeroSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSerial() {
        return numeroSerial;
    }

    /**
     * Sets the value of the numeroSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSerial(String value) {
        this.numeroSerial = value;
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
     * Gets the value of the apellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the nDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDocumento() {
        return nDocumento;
    }

    /**
     * Sets the value of the nDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDocumento(String value) {
        this.nDocumento = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the piso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Sets the value of the piso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Gets the value of the depto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepto() {
        return depto;
    }

    /**
     * Sets the value of the depto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepto(String value) {
        this.depto = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the nPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPostal() {
        return nPostal;
    }

    /**
     * Sets the value of the nPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPostal(String value) {
        this.nPostal = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}
