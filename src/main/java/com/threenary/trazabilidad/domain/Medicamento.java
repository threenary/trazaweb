package com.threenary.trazabilidad.domain;

import com.threenary.generic.base.AbstractPersistentObject;

/**
 * <h2>Medicamento</h2><br>
 * Representación de un medicamento alcanzado por el SNTM para su
 * seguimiento
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 30/10/2012
 */
public class Medicamento extends AbstractPersistentObject {

    /** gtin: un objeto de tipo <code>String</code> */
    private String gtin;

    /** nombre: un objeto de tipo <code>String</code> */
    private String nombre;

    /** forma: un objeto de tipo <code>String</code> */
    private String forma;

    /** presentacion: un objeto de tipo <code>String</code> */
    private String presentacion;

    /**
     * Constructor
     */
    public Medicamento() {
        super();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la gtin.
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Setter
     * 
     * @param gtin
     *            El/La gtin para setear.
     */
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * 
     * @param nombre
     *            El/La nombre para setear.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la forma.
     */
    public String getForma() {
        return forma;
    }

    /**
     * Setter
     * 
     * @param forma
     *            El/La forma para setear.
     */
    public void setForma(String forma) {
        this.forma = forma;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la presentacion.
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * Setter
     * 
     * @param presentacion
     *            El/La presentacion para setear.
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

}