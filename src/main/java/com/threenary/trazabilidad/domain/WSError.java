package com.threenary.trazabilidad.domain;

import java.util.Calendar;

import com.threenary.generic.base.AbstractPersistentObject;

/**
 * <h2>WSError</h2><br>
 * Abstracción de un error retornado por el Web Service del SNTM al
 * informar una transacción
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 18/10/2012
 */
public class WSError extends AbstractPersistentObject {

    /** codigoError: un objeto de tipo <code>String</code> */
    private String codigoError;

    /** detalleError: un objeto de tipo <code>String</code> */
    private String detalleError;

    /** fecha: un objeto de tipo <code>Calendar</code> */
    private Calendar fecha;

    /**
     * Constructor
     */
    public WSError() {
        super();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la codigoError.
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Setter
     * 
     * @param codigoError
     *            El/La codigoError para setear.
     */
    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la detalleError.
     */
    public String getDetalleError() {
        return detalleError;
    }

    /**
     * Setter
     * 
     * @param detalleError
     *            El/La detalleError para setear.
     */
    public void setDetalleError(String detalleError) {
        this.detalleError = detalleError;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la fecha.
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Setter
     * 
     * @param fecha
     *            El/La fecha para setear.
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

}
