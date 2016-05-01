package com.threenary.trazabilidad.domain;

import com.threenary.generic.base.AbstractPersistentObject;

/**
 * <h2>Evento</h2><br>
 * Clase que representa un evento factible de ser informado al SNTM
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 29/10/2012
 */
public class Evento extends AbstractPersistentObject {

    /** codigo: un objeto de tipo <code>Integer</code> */
    private Integer codigo;

    /** descripcion: un objeto de tipo <code>String</code> */
    private String descripcion;

    /** tipoAgenteInformante: un objeto de tipo <code>TipoAgente</code> */
    private TipoAgente tipoAgenteInformante;

    /** tipoAgenteOrigen: un objeto de tipo <code>TipoAgente</code> */
    private TipoAgente tipoAgenteOrigen;

    /** tipoAgenteDestino: un objeto de tipo <code>TipoAgente</code> */
    private TipoAgente tipoAgenteDestino;

    /**
     * Constructor
     */
    public Evento() {
        super();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la codigo.
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Setter
     * 
     * @param codigo
     *            El/La codigo para setear.
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
     * @return Retorna el/la tipoAgenteInformante.
     */
    public TipoAgente getTipoAgenteInformante() {
        return tipoAgenteInformante;
    }

    /**
     * Setter
     * 
     * @param tipoAgenteInformante
     *            El/La tipoAgenteInformante para setear.
     */
    public void setTipoAgenteInformante(TipoAgente tipoAgenteInformante) {
        this.tipoAgenteInformante = tipoAgenteInformante;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la tipoAgenteOrigen.
     */
    public TipoAgente getTipoAgenteOrigen() {
        return tipoAgenteOrigen;
    }

    /**
     * Setter
     * 
     * @param tipoAgenteOrigen
     *            El/La tipoAgenteOrigen para setear.
     */
    public void setTipoAgenteOrigen(TipoAgente tipoAgenteOrigen) {
        this.tipoAgenteOrigen = tipoAgenteOrigen;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la tipoAgenteDestino.
     */
    public TipoAgente getTipoAgenteDestino() {
        return tipoAgenteDestino;
    }

    /**
     * Setter
     * 
     * @param tipoAgenteDestino
     *            El/La tipoAgenteDestino para setear.
     */
    public void setTipoAgenteDestino(TipoAgente tipoAgenteDestino) {
        this.tipoAgenteDestino = tipoAgenteDestino;
    }

}
