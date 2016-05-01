package com.threenary.trazabilidad.service.email;

/**
 * <h2>EmailTemplatesLocator</h2><br>
 * Clase utilitaria para recuperar la ubicación de los templates
 * utilizados para envio de emails.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:g.gomez.sullain@gmail.com"
 *         >g.gomez.sullain@gmail.com</a>
 */
public class EmailWorkflowTemplatesLocator {

    /** urlSite un objeto de tipo <code>String</code> */
    private String urlSite;

    /** emailCreacionPeticion un objeto de tipo <code>String</code> */
    private String emailCreacionPeticion;

    /**
     * emailActualizacionPeticion un objeto de tipo
     * <code>String</code>
     */
    private String emailActualizacionPeticion;

    /** emailCambioEstadoPeticion un objeto de tipo <code>String</code> */
    private String emailCambioEstadoPeticion;

    /** emailComentarioPeticion un objeto de tipo <code>String</code> */
    private String emailComentarioPeticion;

    /** emailActividadEnPeticion un objeto de tipo <code>String</code> */
    private String emailActividadEnPeticion;

    /** emailRecursoEnPeticion un objeto de tipo <code>String</code> */
    private String emailRecursoEnPeticion;

    /** emailReasignacionPeticion un objeto de tipo <code>String</code> */
    private String emailReasignacionPeticion;

    /**
     * Constructor<br>
     */
    public EmailWorkflowTemplatesLocator() {

        super();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la emailActualizacionPeticion.
     */
    public String getEmailActualizacionPeticion() {

        return this.emailActualizacionPeticion;
    }

    /**
     * Setter
     * 
     * @param emailActualizacionPeticion
     *            El/La emailActualizacionPeticion para setear.
     */
    public void setEmailActualizacionPeticion(
            final String emailActualizacionPeticion) {

        this.emailActualizacionPeticion = emailActualizacionPeticion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la emailCambioEstadoPeticion.
     */
    public String getEmailCambioEstadoPeticion() {

        return this.emailCambioEstadoPeticion;
    }

    /**
     * Setter
     * 
     * @param emailCambioEstadoPeticion
     *            El/La emailCambioEstadoPeticion para setear.
     */
    public void setEmailCambioEstadoPeticion(
            final String emailCambioEstadoPeticion) {

        this.emailCambioEstadoPeticion = emailCambioEstadoPeticion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la emailComentarioPeticion.
     */
    public String getEmailComentarioPeticion() {

        return this.emailComentarioPeticion;
    }

    /**
     * Setter
     * 
     * @param emailComentarioPeticion
     *            El/La emailComentarioPeticion para setear.
     */
    public void setEmailComentarioPeticion(final String emailComentarioPeticion) {

        this.emailComentarioPeticion = emailComentarioPeticion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la emailActividadEnPeticion.
     */
    public String getEmailActividadEnPeticion() {

        return this.emailActividadEnPeticion;
    }

    /**
     * Setter
     * 
     * @param emailActividadEnPeticion
     *            El/La emailActividadEnPeticion para setear.
     */
    public void setEmailActividadEnPeticion(
            final String emailActividadEnPeticion) {

        this.emailActividadEnPeticion = emailActividadEnPeticion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la emailRecursoEnPeticion.
     */
    public String getEmailRecursoEnPeticion() {

        return this.emailRecursoEnPeticion;
    }

    /**
     * Setter
     * 
     * @param emailRecursoEnPeticion
     *            El/La emailRecursoEnPeticion para setear.
     */
    public void setEmailRecursoEnPeticion(final String emailRecursoEnPeticion) {

        this.emailRecursoEnPeticion = emailRecursoEnPeticion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la emailReasignacionPeticion.
     */
    public String getEmailReasignacionPeticion() {

        return this.emailReasignacionPeticion;
    }

    /**
     * Setter
     * 
     * @param emailReasignacionPeticion
     *            El/La emailReasignacionPeticion para setear.
     */
    public void setEmailReasignacionPeticion(
            final String emailReasignacionPeticion) {

        this.emailReasignacionPeticion = emailReasignacionPeticion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la emailCreacionPeticion.
     */
    public String getEmailCreacionPeticion() {

        return this.emailCreacionPeticion;
    }

    /**
     * Setter
     * 
     * @param emailCreacionPeticion
     *            El/La emailCreacionPeticion para setear.
     */
    public void setEmailCreacionPeticion(final String emailCreacionPeticion) {

        this.emailCreacionPeticion = emailCreacionPeticion;
    }

    /**
     * Getter
     * 
     * @return Retorna el/la urlSite.
     */
    public String getUrlSite() {

        return this.urlSite;
    }

    /**
     * Setter
     * 
     * @param urlSite
     *            El/La urlSite para setear.
     */
    public void setUrlSite(final String urlSite) {

        this.urlSite = urlSite;
    }
}