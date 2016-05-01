package com.threenary.trazabilidad.service.crud;

import java.util.List;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.MovimientoDAO;
import com.threenary.trazabilidad.domain.Movimiento;

/**
 * <h2>MovimientoCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>Movimiento</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class MovimientoCRUDService extends
        AbstractGenericCRUDService<Movimiento> {

    /** movimientoDAO un objeto de tipo <code>MovimientoDAO</code> */
    private MovimientoDAO movimientoDAO;

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>Movimiento</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<Movimiento> getMainDAO() {
        return this.getMovimientoDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la movimientoDAO.
     */
    public MovimientoDAO getMovimientoDAO() {
        return movimientoDAO;
    }

    /**
     * Setter
     * 
     * @param movimientoDAO
     *            El/La movimientoDAO para setear.
     */
    public void setMovimientoDAO(MovimientoDAO movimientoDAO) {
        this.movimientoDAO = movimientoDAO;
    }

    /**
     * Recupera las instancias de los Movimientos que aún no han sido
     * informados al SNTM
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @return una lista de objetos tipo <code>Movimiento</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     * @fecha 22/10/2012
     */
    public List<Movimiento> getMovimientosPendientes(ResultConfig resultConfig) {
        return this.getMovimientoDAO().getMovimientosPendientes(resultConfig);
    }
}
