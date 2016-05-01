package com.threenary.trazabilidad.domain;

import java.util.Calendar;
import java.util.Set;

import com.threenary.generic.base.AbstractPersistentObject;
import com.threenary.generic.utils.DateUtils;
import com.threenary.trazabilidad.domain.enums.EstadoEdicion;
import com.threenary.trazabilidad.domain.enums.EstadoTrazable;

/**
 * <h2>Movimiento</h2><br>
 * Representa un movimiento de medicamentos trazables que deberá ser
 * informado al SNTM
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 13/11/2012
 */
public class Movimiento extends AbstractPersistentObject {

    /** estadoTrazable: un objeto de tipo <code>EstadoTrazable</code>*/
    private EstadoTrazable estadoTrazable = EstadoTrazable.PREPARADO;
    
    /** edicion: un objeto de tipo <code>EstadoEdicion</code> */
    private EstadoEdicion edicion = EstadoEdicion.ABIERTA;
    
    /** fechaEvento: un objeto de tipo <code>Calendar</code> */
    private Calendar fechaEvento;

    /** horaEvento: un objeto de tipo <code>Calendar</code> */
    private Calendar horaEvento;

    /** remito: un objeto de tipo <code>long</code> */
    private long remito;

    /** factura: un objeto de tipo <code>long</code> */
    private long factura;

    /** agenteOrigen: un objeto de tipo <code>Agente</code> */
    private Agente agenteOrigen;

    /** agenteDestino: un objeto de tipo <code>Agente</code> */
    private Agente agenteDestino;

    /** evento: un objeto de tipo <code>Evento</code> */
    private Evento evento;

    /** envios: un objeto de tipo <code>Set</code> */
    private Set<Envio> envios;
   
    // SI SE TRATA DE UNA MUESTRA MÉDICA

    /** apellido: un objeto de tipo <code>String</code> */
    private String apellido;

    /** nombre: un objeto de tipo <code>String</code> */
    private String nombre;

    /** sexo: un objeto de tipo <code>String</code> */
    private String sexo;

    /** idTipoDocumento: un objeto de tipo <code>String</code> */
    private int idTipoDocumento;

    /** nroDocumento: un objeto de tipo <code>String</code> */
    private String nroDocumento;

    /** direccion: un objeto de tipo <code>String</code> */
    private String direccion;

    /** localidad: un objeto de tipo <code>String</code> */
    private String localidad;

    /** numero: un objeto de tipo <code>String</code> */
    private String numero;

    /** piso: un objeto de tipo <code>String</code> */
    private String piso;

    /** dpto: un objeto de tipo <code>String</code> */
    private String dpto;

    /** codigoPostal: un objeto de tipo <code>String</code> */
    private String codigoPostal;

    /** telefono: un objeto de tipo <code>String</code> */
    private String telefono;

    /** idObraSocial: un objeto de tipo <code>String</code> */
    private int idObraSocial;

    /**
     * Constructor
     */
    public Movimiento() {
    }
    
    /**
     * Getter
     *
     * @return Retorna el/la estadoTrazable.
     */
    public EstadoTrazable getEstadoTrazable() {
        return estadoTrazable;
    }

    /**
     * Setter
     *
     * @param estadoTrazable El/La estadoTrazable para setear.
     */
    public void setEstadoTrazable(EstadoTrazable estadoTrazable) {
        this.estadoTrazable = estadoTrazable;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la edicion.
     */
    public EstadoEdicion getEdicion() {
        return edicion;
    }

    /**
     * Setter
     * 
     * @param edicion
     *            El/La edicion para setear.
     */
    public void setEdicion(EstadoEdicion edicion) {
        this.edicion = edicion;
    }
    
    /**
     * Abre el estado de edicion del Movimiento
     * 
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public void abrirEdicion() {
        this.edicion = EstadoEdicion.ABIERTA;
    }

    /**
     * Cierra el estado de edicion del Movimiento
     * 
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public void cerrarEdicion() {
        this.edicion = EstadoEdicion.CERRADA;
    }

    /**
     * Consulta el estado de edición
     * 
     * @return
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public boolean isEditable() {
        return this.edicion.isAbierta();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la fechaEvento.
     */
    public Calendar getFechaEvento() {
        return fechaEvento;
    }

    /**
     * Getter
     * 
     * @return el/la fechaEvento en formato de
     *         <code>String</code>
     */
    public String getFechaEventoToString() {
        return DateUtils.formatDate(this.fechaEvento);
    }

    /**
     * Setter
     * 
     * @param fechaEvento
     *            El/La fechaEvento para setear.
     */
    public void setFechaEvento(Calendar fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la horaEvento.
     */
    public Calendar getHoraEvento() {
        return horaEvento;
    }
    
    /**
     * Getter
     * @return el/la horaEvento en formato de <code>String</code>
     */
    public String getHoraEventoToString(){
        return DateUtils.formatTime(this.horaEvento);
    }

    /**
     * Setter
     * 
     * @param horaEvento
     *            El/La horaEvento para setear.
     */
    public void setHoraEvento(Calendar horaEvento) {
        this.horaEvento = horaEvento;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la remito.
     */
    public long getRemito() {
        return remito;
    }

    /**
     * Setter
     * 
     * @param remito
     *            El/La remito para setear.
     */
    public void setRemito(long remito) {
        this.remito = remito;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la factura.
     */
    public long getFactura() {
        return factura;
    }

    /**
     * Setter
     * 
     * @param factura
     *            El/La factura para setear.
     */
    public void setFactura(long factura) {
        this.factura = factura;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la agenteOrigen.
     */
    public Agente getAgenteOrigen() {
        return agenteOrigen;
    }

    /**
     * Setter
     * 
     * @param agenteOrigen
     *            El/La agenteOrigen para setear.
     */
    public void setAgenteOrigen(Agente agenteOrigen) {
        this.agenteOrigen = agenteOrigen;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la agenteDestino.
     */
    public Agente getAgenteDestino() {
        return agenteDestino;
    }

    /**
     * Setter
     * 
     * @param agenteDestino
     *            El/La agenteDestino para setear.
     */
    public void setAgenteDestino(Agente agenteDestino) {
        this.agenteDestino = agenteDestino;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la evento.
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * Setter
     * 
     * @param evento
     *            El/La evento para setear.
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la envios.
     */
    public Set<Envio> getEnvios() {
        return envios;
    }

    /**
     * Setter
     * 
     * @param envios
     *            El/La envios para setear.
     */
    public void setEnvios(Set<Envio> envios) {
        this.envios = envios;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la apellido.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setter
     * 
     * @param apellido
     *            El/La apellido para setear.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * @return Retorna el/la sexo.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Setter
     * 
     * @param sexo
     *            El/La sexo para setear.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la idTipoDocumento.
     */
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Setter
     * 
     * @param idTipoDocumento
     *            El/La idTipoDocumento para setear.
     */
    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la nroDocumento.
     */
    public String getNroDocumento() {
        return nroDocumento;
    }

    /**
     * Setter
     * 
     * @param nroDocumento
     *            El/La nroDocumento para setear.
     */
    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la direccion.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter
     * 
     * @param direccion
     *            El/La direccion para setear.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la localidad.
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Setter
     * 
     * @param localidad
     *            El/La localidad para setear.
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la numero.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Setter
     * 
     * @param numero
     *            El/La numero para setear.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la piso.
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Setter
     * 
     * @param piso
     *            El/La piso para setear.
     */
    public void setPiso(String piso) {
        this.piso = piso;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la dpto.
     */
    public String getDpto() {
        return dpto;
    }

    /**
     * Setter
     * 
     * @param dpto
     *            El/La dpto para setear.
     */
    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la codigoPostal.
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Setter
     * 
     * @param codigoPostal
     *            El/La codigoPostal para setear.
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la telefono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter
     * 
     * @param telefono
     *            El/La telefono para setear.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la idObraSocial.
     */
    public int getIdObraSocial() {
        return idObraSocial;
    }

    /**
     * Setter
     * 
     * @param idObraSocial
     *            El/La idObraSocial para setear.
     */
    public void setIdObraSocial(int idObraSocial) {
        this.idObraSocial = idObraSocial;
    }

}
