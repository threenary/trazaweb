package com.threenary.trazabilidad.service.advice.validation;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import com.threenary.generic.constants.ErrorMessageConstants;
import com.threenary.generic.exceptions.BusinessException;
import com.threenary.generic.exceptions.UnexpectedException;
import com.threenary.generic.service.advice.AbstractGenericBeforeAdvice;
import com.threenary.trazabilidad.domain.Movimiento;

/**
 * <h2>MovimientoCerradoValidationAdvice</h2><br>
 * Interceptor con validaciones para los movimientos que verifica que
 * el movimiento sobre el que se quiere realizar una operacion de CRUD
 * no esté cerrado
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 15/11/2012
 */
public class MovimientoCerradoValidationAdvice extends
        AbstractGenericBeforeAdvice {

    /** logger un objeto de tipo <code>Logger</code> */
    private static Logger logger = Logger
            .getLogger(MovimientoCerradoValidationAdvice.class);

    /**
     * Constructor
     */
    public MovimientoCerradoValidationAdvice() {
        super();
    }

    /**
     * Intercepta las llamadas a los métodos configurados en un
     * advisor, y valida que el movimiento que se intenta modificar no
     * esté cerrado / inhabilitado
     * 
     * @param method
     *            un objeto de tipo <code>Method</code>
     * @param args
     *            un array de argumentos
     * @param target
     *            un objeto de tipo <code>Object</code>
     * @throws Throwable
     *             un error de tipo <code>Throwable</code>
     * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method,
     *      java.lang.Object[], java.lang.Object)
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    @Override
    public void before(final Method method, final Object[] args,
            final Object target) throws Throwable {

        logger.debug(INICIO_DE_VALIDACION);
        Movimiento movimiento = null;
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Movimiento) {
                movimiento = (Movimiento) args[i];
            }
        }
        if (movimiento == null) {
            final String message = this.getErrorsService().getMessage(
                    ErrorMessageConstants.ERROR_0010);
            logger.debug(FIN_DE_VALIDACION_ERROR);
            throw new UnexpectedException(message);
        } else {
            if (movimiento.getEdicion().isCerrada()
                    || movimiento.getEstadoTrazable().isInformado()
                    || movimiento.getEstadoTrazable().isCancelado()) {
                final String message = this.getErrorsService().getMessage(
                        ErrorMessageConstants.ERROR_0300);
                logger.debug(FIN_DE_VALIDACION_ERROR);
                throw new BusinessException(message);
            }
        }
        logger.debug(FIN_DE_VALIDACION_EXITO);
    }
}