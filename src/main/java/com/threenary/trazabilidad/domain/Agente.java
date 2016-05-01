package com.threenary.trazabilidad.domain;

import com.threenary.generic.base.AbstractPersistentObject;

/**
 * <h2>Agente</h2><br>
 * Clase que representa un agente que intervendrá en movimientos del
 * SNTM
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 18/10/2012
 */
public class Agente extends AbstractPersistentObject {

    /** gln: un objeto de tipo <code>String</code> */
    private String gln;

    /** cuit: un objeto de tipo <code>String</code> */
    private String cuit;

    /** descripcion: un objeto de tipo <code>String</code> */
    private String descripcion;

    /** tipoAgente: un objeto de tipo <code>TipoAgente</code> */
    private TipoAgente tipoAgente;

    /**
     * Constructor
     */
    public Agente() {
        super();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la gln.
     */
    public String getGln() {
        return gln;
    }

    /**
     * Setter
     * 
     * @param gln
     *            El/La gln para setear.
     */
    public void setGln(String gln) {
        this.gln = gln;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la cuit.
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * Setter
     * 
     * @param cuit
     *            El/La cuit para setear.
     */
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter
     * 
     * @param descripcion
     *            El/La descripcion para setear.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la tipoAgente.
     */
    public TipoAgente getTipoAgente() {
        return tipoAgente;
    }

    /**
     * Setter
     * 
     * @param tipoAgente
     *            El/La tipoAgente para setear.
     */
    public void setTipoAgente(TipoAgente tipoAgente) {
        this.tipoAgente = tipoAgente;
    }

}
