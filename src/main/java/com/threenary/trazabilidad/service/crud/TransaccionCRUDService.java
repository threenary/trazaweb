package com.threenary.trazabilidad.service.crud;

import java.util.List;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.AbstractTransaccionDAO;
import com.threenary.trazabilidad.domain.AbstractTransaccion;

/**
 * <h2>TransaccionCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>Transaccion</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class TransaccionCRUDService extends
        AbstractGenericCRUDService<AbstractTransaccion> {

    /**
     * transaccionDAO: un objeto de tipo <code>TransaccionDAO</code>
     */
    private AbstractTransaccionDAO transaccionDAO;

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>Transaccion</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<AbstractTransaccion> getMainDAO() {
        return this.getTransaccionDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la transaccionDAO.
     */
    public AbstractTransaccionDAO getTransaccionDAO() {
        return transaccionDAO;
    }

    /**
     * Setter
     * 
     * @param transaccionDAO
     *            El/La transaccionDAO para setear.
     */
    public void setTransaccionDAO(AbstractTransaccionDAO transaccionDAO) {
        this.transaccionDAO = transaccionDAO;
    }

    /**
     * Recupera las transacciones que han retornado errores al ser
     * informadas al SNTM
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @return una lista de objetos tipo
     *         <code>AbstractTransaccion</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     * @fecha 22/10/2012
     */
    public List<AbstractTransaccion> getTransaccionesErroneas(ResultConfig resultConfig) {
        return this.getTransaccionDAO().getTransaccionesErroneas(resultConfig);
    }

}
