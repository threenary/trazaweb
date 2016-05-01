package com.threenary.trazabilidad.domain;

import java.util.Calendar;
import java.util.List;

import com.threenary.generic.base.AbstractPersistentObject;
import com.threenary.trazabilidad.domain.enums.EstadoTrazable;

/**
 * <h2>AbstractTransaccion</h2><br>
 * Clase base que representa una transacción con el SNTM (ya sea una
 * cancelación o un movimiento informado)
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 31/10/2012
 */
public class AbstractTransaccion extends AbstractPersistentObject {

    /** estado: un objeto de tipo <code>EstadoTrazable</code> */
    private EstadoTrazable estado = EstadoTrazable.PREPARADO;

    /** codigoTransaccion: un objeto de tipo <code>String</code> */
    private String codigoTransaccion;

    /** fecha: un objeto de tipo <code>Calendar</code> */
    private Calendar fechaTransaccion;

    /** errores: un objeto de tipo <code>List<WSError></code> */
    private List<WSError> errores;

    /**
     * Constructor
     */
    public AbstractTransaccion() {
        super();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la estado.
     */
    public EstadoTrazable getEstado() {
        return estado;
    }

    /**
     * Setter
     * 
     * @param estado
     *            El/La estado para setear.
     */
    public void setEstado(EstadoTrazable estado) {
        this.estado = estado;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la codigoTransaccion.
     */
    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    /**
     * Setter
     * 
     * @param codigoTransaccion
     *            El/La codigoTransaccion para setear.
     */
    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la errores.
     */
    public List<WSError> getErrores() {
        return errores;
    }

    /**
     * Setter
     * 
     * @param errores
     *            El/La errores para setear.
     */
    public void setErrores(List<WSError> errores) {
        this.errores = errores;
    }

    /**
     * Agrega el error a la lista de errores del envio
     * 
     * @param error
     *            <code>WSError</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public void agregarError(WSError error) {
        this.getErrores().add(error);
    }

    /**
     * Getter
     * 
     * @return Retorna el/la fechaTransaccion.
     */
    public Calendar getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Setter
     * 
     * @param fechaTransaccion
     *            El/La fechaTransaccion para setear.
     */
    public void setFechaTransaccion(Calendar fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    /**
     * Setea el estado de la transaccion cuando esta preparada
     * 
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public void preparar() {
        this.setEstado(EstadoTrazable.PREPARADO);
    }

    /**
     * Setea el estado de la transaccion cuando fué informado
     * 
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public void informar() {
        this.setEstado(EstadoTrazable.INFORMADO);
    }

    /**
     * Setea el estado de la transaccion cuando fué cancelado
     * 
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public void cancelar() {
        this.setEstado(EstadoTrazable.CANCELADO);
    }
}
