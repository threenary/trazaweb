package com.threenary.trazabilidad.service.advice.validation;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import com.threenary.generic.constants.ErrorMessageConstants;
import com.threenary.generic.exceptions.BusinessException;
import com.threenary.generic.exceptions.UnexpectedException;
import com.threenary.generic.service.advice.AbstractGenericBeforeAdvice;
import com.threenary.trazabilidad.domain.Cancelacion;

/**
 * <h2>CancelacionCerradaValidationAdvice</h2><br>
 * Interceptor con validaciones para las cancelaciones que verifica que
 * la cancelación sobre el que se quiere realizar una operacion de CRUD
 * no esté cerrado
 *
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a href="mailto:gsullain@mbsoftsa.com.ar">gsullain@mbsoftsa.com.ar</a>
 * @fecha 15/11/2012
 */
public class CancelacionCerradaValidationAdvice extends
        AbstractGenericBeforeAdvice {

    /** logger un objeto de tipo <code>Logger</code> */
    private static Logger logger = Logger
            .getLogger(CancelacionCerradaValidationAdvice.class);

    /**
     * Constructor
     */
    public CancelacionCerradaValidationAdvice() {
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
        Cancelacion cancelacion = null;
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof Cancelacion) {
                cancelacion = (Cancelacion) args[i];
            }
        }
        if (cancelacion == null) {
            final String message = this.getErrorsService().getMessage(
                    ErrorMessageConstants.ERROR_0010);
            logger.debug(FIN_DE_VALIDACION_ERROR);
            throw new UnexpectedException(message);
        } else {
            if (cancelacion.getEstado().isInformado()) {
                final String message = this.getErrorsService().getMessage(
                        ErrorMessageConstants.ERROR_0301);
                logger.debug(FIN_DE_VALIDACION_ERROR);
                throw new BusinessException(message);
            }
        }
        logger.debug(FIN_DE_VALIDACION_EXITO);
    }
}