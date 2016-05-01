package com.threenary.trazabilidad.domain;

import com.threenary.generic.base.AbstractPersistentObject;

/**
 * <h2>WSUser</h2><br>
 * Almacena los datos de usuario para la autenticación via Web
 * Serivces con el SNTM
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 18/10/2012
 */
public class WSUser extends AbstractPersistentObject {

    /** nombre: un objeto de tipo <code>String</code> */
    private String nombre;

    /** password: un objeto de tipo <code>String</code> */
    private String password;

    /** hashRecuperarPassword: un objeto de tipo <code>String</code> */
    private String hashRecuperarPassword;

    /**
     * Constructor
     */
    public WSUser() {
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

    /**
     * Getter
     * 
     * @return Retorna el/la password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter
     * 
     * @param password
     *            El/La password para setear.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la hashRecuperarPassword.
     */
    public String getHashRecuperarPassword() {
        return hashRecuperarPassword;
    }

    /**
     * Setter
     * 
     * @param hashRecuperarPassword
     *            El/La hashRecuperarPassword para setear.
     */
    public void setHashRecuperarPassword(String hashRecuperarPassword) {
        this.hashRecuperarPassword = hashRecuperarPassword;
    }

}
