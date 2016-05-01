package com.threenary.trazabilidad.domain;

import com.threenary.generic.base.AbstractPersistentObject;

/**
 * <h2>TipoAgente</h2><br>
 * Datos de los tipos de agente comprendidos dentro del SNTM
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 18/10/2012
 */
public class TipoAgente extends AbstractPersistentObject{

    /** nombre: un objeto de tipo <code>String</code> */
    private String nombre;

    /**
     * Constructor
     */
    public TipoAgente() {
        super();
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

}
