package com.threenary.trazabilidad.domain.enums;

/**
 * <h2>EstadoTrazable</h2><br>
 * Describe el estado en el que se encuentra el Envio o el Movimiento
 * respecto de sus envios: si está activo para ser trazable, o si está
 * trazado o si está cancelado.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 */
public enum EstadoTrazable {

    /**
     * <h2>PREPARADO</h2><br>
     * Estado donde en el que el envio está listo para ser informado
     */
    PREPARADO(EstadoTrazable.PREPARADO_STRING) {

        /**
         * @see ar.com.mbsoftsa.EstadoTrazable.domain.enumEstadoWorkflow#isPreparado()
         */
        @Override
        public boolean isPreparado() {

            return true;
        }
    },
    /**
     * <h2>ACTIVO</h2><br>
     * Estado donde en el que el envio ha sido informado y puede ser
     * cancelado
     */
    INFORMADO(EstadoTrazable.INFORMADO_STRING) {

        /**
         * @see ar.com.mbsoftsa.EstadoTrazable.domain.enumEstadoWorkflow#isInformado()
         */
        @Override
        public boolean isInformado() {

            return true;
        }
    },
    /**
     * <h2>CANCELADO</h2><br>
     * Estado donde en el que el envio no está disponible para ningún
     * tipo de modificación
     */
    CANCELADO(EstadoTrazable.CANCELADO_STRING) {

        /**
         * @see ar.com.mbsoftsa.EstadoTrazable.domain.enumEstadoWorkflow#isCancelado()
         */
        @Override
        public boolean isCancelado() {

            return true;
        }
    };

    /**
     * Constructor
     * 
     * @param descripcion
     *            un objeto de tipo <code>String</code>
     * @author Gonzalo Gómez Sullain <a
     *         href="mailto:g.gomez.sullain@gmail.com"
     *         >g.gomez.sullain@gmail.com</a>
     */
    private EstadoTrazable(final String descripcion) {

        this.descripcion = descripcion;
    }

    /** descripcion un objeto de tipo <code>String</code> */
    private String descripcion;

    /** PREPARADO_STRING: un objeto de tipo <code>String</code> */
    private static final String PREPARADO_STRING = "Preparado"; //$NON-NLS-1$

    /** INFORMADO_STRING: un objeto de tipo <code>String</code> */
    private static final String INFORMADO_STRING = "Enviado"; //$NON-NLS-1$

    /** CANCELADO_STRING: un objeto de tipo <code>String</code> */
    private static final String CANCELADO_STRING = "Inactivo"; //$NON-NLS-1$

    /**
     * Devuelve el codigo del estado
     * 
     * @return un objeto de tipo <code>String</code>
     * @author Gonzalo Gómez Sullain <a
     *         href="mailto:g.gomez.sullain@gmail.com"
     *         >g.gomez.sullain@gmail.com</a>
     */
    public String getCodigo() {

        return this.name();
    }

    /**
     * Devuelve la descripción del estado
     * 
     * @return un objeto de tipo <code>String</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public String getDescripcion() {

        return this.descripcion;
    }

    /**
     * Indica si el estado es activo
     * 
     * @return true si el estado es activo, false en caso contrario
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public boolean isInformado() {

        return false;
    }

    /**
     * Indica si el estado es inactivo
     * 
     * @return true si el estado es inactivo, false en caso contrario
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public boolean isCancelado() {

        return false;
    }

    /**
     * Indica si el estado es desarrollo
     * 
     * @return true si el estado es desarrollo, false en caso
     *         contrario
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public boolean isPreparado() {

        return false;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return this.descripcion;
    }

    /**
     * Retorna un objeto de tipo <code>EstadoWorkflow</code> cuya
     * descripción comienza con el string pasado como parámetro.
     * 
     * @param descripcion
     *            la descripción del estado o un fragmento de la
     *            misma.
     * @return un objeto de tipo <code>EstadoWorkflow</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public static EstadoTrazable getByDescription(final String descripcion) {

        for (final EstadoTrazable estadoWorkflow : values()) {
            if (estadoWorkflow.getDescripcion().toLowerCase()
                    .startsWith(descripcion.toLowerCase())) {
                return estadoWorkflow;
            }
        }
        return null;
    }
}