package com.threenary.trazabilidad.domain.enums;

public enum EstadoEdicion {

    ABIERTA(EstadoEdicion.ABIERTA_STRING) {

        /**
         * @see ar.com.mbsoftsa.EstadoTrazable.domain.enum.EstadoEdicion#isAbierta()
         */
        @Override
        public boolean isAbierta() {

            return true;
        }
    },

    CERRADA(EstadoEdicion.CERRADA_STRING) {

        /**
         * @see ar.com.mbsoftsa.EstadoTrazable.domain.enum.EstadoEdicion#isCerrada()
         */
        @Override
        public boolean isAbierta() {

            return true;
        }
    };

    /**
     * Constructor
     * 
     * @param descripcion
     *            un objeto de tipo <code>String</code>
     * @param habilitado
     *            un boolean
     */
    private EstadoEdicion(final String descripcion) {

        this.descripcion = descripcion;
    }

    /** descripcion un objeto de tipo <code>String</code> */
    private String descripcion;

    /** ABIERTA_STRING: un objeto de tipo <code>String</code> */
    private static final String ABIERTA_STRING = "Abierta"; //$NON-NLS-1$

    /** CERRADA_STRING: un objeto de tipo <code>String</code> */
    private static final String CERRADA_STRING = "Cerrada"; //$NON-NLS-1$

    /**
     * Devuelve el codigo del estado
     * 
     * @return un objeto de tipo <code>String</code>
     */
    public String getCodigo() {

        return this.name();
    }

    /**
     * Devuelve la descripción del estado
     * 
     * @return un objeto de tipo <code>String</code>
     */
    public String getDescripcion() {

        return this.descripcion;
    }

    /**
     * Indica si la edicion esta abierta
     * 
     * @return true si la edicion es activo, false en caso contrario
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public boolean isAbierta() {

        return false;
    }

    /**
     * Indica si la edicion es cerrada
     * 
     * @return true si la edicion esta cerrada, false en caso
     *         contrario
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public boolean isCerrada() {

        return false;
    }

    /**
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {

        return this.descripcion;
    }

    /**
     * Retorna un objeto de tipo <code>EstadoEdicion</code> cuya
     * descripción comienza con el string pasado como parámetro.
     * 
     * @param descripcion
     *            La descripción del estado o un fragmento de la
     *            misma.
     * @return un objeto de tipo <code>EstadoEdicion</code>
     */
    public static EstadoEdicion getByDescription(final String descripcion) {
        for (final EstadoEdicion estado : values()) {
            if (estado.getDescripcion().toLowerCase()
                    .startsWith(descripcion.toLowerCase())) {
                return estado;
            }
        }
        return null;
    }
}