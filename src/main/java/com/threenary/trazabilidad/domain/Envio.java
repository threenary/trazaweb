package com.threenary.trazabilidad.domain;

import java.util.Calendar;

import com.threenary.generic.utils.DateUtils;

/**
 * <h2>Envio</h2><br>
 * Representa una transacción de un medicamento trazable contenido en
 * un remito que es informado al SNTM
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 13/11/2012
 */
public class Envio extends AbstractTransaccion {

    /** vencimiento: un objeto de tipo <code>Calendar</code> */
    private Calendar vencimiento;

    /** lote: un objeto de tipo <code>String</code> */
    private String lote;

    /** serie: un objeto de tipo <code>String</code> */
    private String serie;

    /** medicamento: un objeto de tipo <code>Medicamento</code> */
    private Medicamento medicamento;

    /** movimiento: un objeto de tipo <code>Movimiento</code> */
    private Movimiento movimiento;

    /**
     * Constructor
     */
    public Envio() {
    }

    /**
     * Getter
     * 
     * @return Retorna el/la vencimiento.
     */
    public Calendar getVencimiento() {
        return vencimiento;
    }

    /**
     * Getter
     * 
     * @return Retorna la fecha de vencimiento en formato de
     *         <code>String</code>
     */
    public String getVencimientoToString() {
        return DateUtils.formatDate(this.vencimiento);
    }

    /**
     * Setter
     * 
     * @param vencimiento
     *            El/La vencimiento para setear.
     */
    public void setVencimiento(Calendar vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la lote.
     */
    public String getLote() {
        return lote;
    }

    /**
     * Setter
     * 
     * @param lote
     *            El/La lote para setear.
     */
    public void setLote(String lote) {
        this.lote = lote;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la serie.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Setter
     * 
     * @param serie
     *            El/La serie para setear.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la medicamento.
     */
    public Medicamento getMedicamento() {
        return medicamento;
    }

    /**
     * Setter
     * 
     * @param medicamento
     *            El/La medicamento para setear.
     */
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la movimiento.
     */
    public Movimiento getMovimiento() {
        return movimiento;
    }

    /**
     * Setter
     * 
     * @param movimiento
     *            El/La movimiento para setear.
     */
    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }
}

