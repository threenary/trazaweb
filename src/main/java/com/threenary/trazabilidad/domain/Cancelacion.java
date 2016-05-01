package com.threenary.trazabilidad.domain;

/**
 * <h2>Cancelacion</h2><br>
 * Representa un movimiento que cancelará un movimiento previamente
 * informado al SNTM
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 31/10/2012
 */
public class Cancelacion extends AbstractTransaccion {

    /** envioCancelado: un objeto de tipo <code>Envio</code> */
    private Envio envioCancelado;

    /**
     * Constructor
     */
    public Cancelacion() {
        super();
    }

    /**
     * Constructor
     * 
     * @param envio
     *            el objeto <code>Envio</code>
     */
    public Cancelacion(Envio envio) {
        this.setEnvioCancelado(envio);
    }

    /**
     * Getter
     * 
     * @return Retorna el/la envioCancelado.
     */
    public Envio getEnvioCancelado() {
        return envioCancelado;
    }

    /**
     * Setter
     * 
     * @param envioCancelado
     *            El/La envioCancelado para setear.
     */
    public void setEnvioCancelado(Envio envioCancelado) {
        this.envioCancelado = envioCancelado;
    }

}
