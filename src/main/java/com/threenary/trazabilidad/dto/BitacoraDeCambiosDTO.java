package com.threenary.trazabilidad.dto;

import java.util.Calendar;
import java.util.Date;

import com.threenary.generic.audit.domain.BitacoraDeCambios;
import com.threenary.generic.dto.AbstractDTO;
import com.threenary.generic.utils.DateUtils;
import com.threenary.generic.utils.StringUtils;

/**
 * <h2>BitacoraDeCambiosDTO</h2><br>
 * DTO que contiene la información de un bitácora para construir, por
 * ejemplo, reportes.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:g.gomez.sullain@gmail.com"
 *         >g.gomez.sullain@gmail.com</a>
 */
public class BitacoraDeCambiosDTO extends AbstractDTO implements
        Comparable<BitacoraDeCambiosDTO> {

    /** fecha un objeto de tipo <code>Calendar</code> */
    private Date fecha;

    /** username un objeto de tipo <code>String</code> */
    private String username;

    /** nombreAtributo un objeto de tipo <code>String</code> */
    private String nombreAtributo;

    /** antiguoValor un objeto de tipo <code>String</code> */
    private String antiguoValor;

    /** nuevoValor un objeto de tipo <code>String</code> */
    private String nuevoValor;

    /**
     * Constructor
     * 
     * @author Gonzalo Gómez Sullain <a
     *         href="mailto:g.gomez.sullain@gmail.com"
     *         >g.gomez.sullain@gmail.com</a>
     */
    public BitacoraDeCambiosDTO() {

        super();
    }

    /**
     * Constructor
     * 
     * @param bitacoraDeCambios
     *            un objeto de tipo <code>BitacoraDeCambios</code>
     * @author Gonzalo Gómez Sullain <a
     *         href="mailto:g.gomez.sullain@gmail.com"
     *         >g.gomez.sullain@gmail.com</a>
     */
    public BitacoraDeCambiosDTO(final BitacoraDeCambios bitacoraDeCambios) {

        this();
        this.fecha = bitacoraDeCambios.getFecha().getTime();
        this.username = bitacoraDeCambios.getUsuario();
        this.nombreAtributo = bitacoraDeCambios
                .getDescripcionCalculadaAtributo();
        this.antiguoValor = StringUtils.removeHtmlTags(
                bitacoraDeCambios.getAntiguoValor()).trim();
        this.nuevoValor = StringUtils.removeHtmlTags(
                bitacoraDeCambios.getNuevoValor()).trim();
    }

    /**
     * Constructor
     * 
     * @param fecha
     *            un objeto de tipo <code>Calendar</code>
     * @param username
     *            un objeto de tipo <code>String</code>
     * @param nombreAtributo
     *            un objeto de tipo <code>String</code>
     * @param antiguoValor
     *            un objeto de tipo <code>String</code>
     * @param nuevoValor
     *            un objeto de tipo <code>String</code>
     * @author Gonzalo Gómez Sullain <a
     *         href="mailto:g.gomez.sullain@gmail.com"
     *         >g.gomez.sullain@gmail.com</a>
     */
    public BitacoraDeCambiosDTO(final Calendar fecha, final String username,
            final String nombreAtributo, final String antiguoValor,
            final String nuevoValor) {

        this();
        this.fecha = fecha.getTime();
        this.username = username;
        this.nombreAtributo = nombreAtributo;
        this.antiguoValor = StringUtils.removeHtmlTags(antiguoValor).trim();
        this.nuevoValor = StringUtils.removeHtmlTags(nuevoValor).trim();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la antiguoValor.
     */
    public String getAntiguoValor() {

        return this.antiguoValor;
    }

    /**
     * Setter
     * 
     * @param antiguoValor
     *            El/La antiguoValor para setear.
     */
    public void setAntiguoValor(final String antiguoValor) {

        this.antiguoValor = antiguoValor;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la nombreAtributo.
     */
    public String getNombreAtributo() {

        return this.nombreAtributo;
    }

    /**
     * Setter
     * 
     * @param nombreAtributo
     *            El/La nombreAtributo para setear.
     */
    public void setNombreAtributo(final String nombreAtributo) {

        this.nombreAtributo = nombreAtributo;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la nuevoValor.
     */
    public String getNuevoValor() {

        return this.nuevoValor;
    }

    /**
     * Setter
     * 
     * @param nuevoValor
     *            El/La nuevoValor para setear.
     */
    public void setNuevoValor(final String nuevoValor) {

        this.nuevoValor = nuevoValor;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la fecha.
     */
    public Date getFecha() {

        return this.fecha;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la fecha.
     */
    public String getFechaToString() {

        return DateUtils.formatDateTime(this.fecha);
    }

    /**
     * Setter
     * 
     * @param fecha
     *            El/La fecha para setear.
     */
    public void setFecha(final Date fecha) {

        this.fecha = fecha;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la username.
     */
    public String getUsername() {

        return this.username;
    }

    /**
     * Setter
     * 
     * @param username
     *            El/La username para setear.
     */
    public void setUsername(final String username) {

        this.username = username;
    }

    /**
     * Ordena las bitácoras por fecha, de manera descendente
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(final BitacoraDeCambiosDTO otherInstance) {

        return this.getFecha().compareTo(otherInstance.getFecha());
    }
}