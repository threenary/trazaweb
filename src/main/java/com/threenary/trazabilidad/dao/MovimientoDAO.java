package com.threenary.trazabilidad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.threenary.generic.constants.PropertyConstants;
import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.trazabilidad.domain.Movimiento;
import com.threenary.trazabilidad.domain.enums.EstadoTrazable;

/**
 * <h2>MovimientoDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>Movimiento</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class MovimientoDAO extends AbstractDAO<Movimiento> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public MovimientoDAO() {
        super(Movimiento.class);
    }

    /**
     * Devuelve los movimientos pendientes de ser informados al SNTM,
     * paginados y ordenados por el criterio recibido en la
     * configuración
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
        Criteria criteria = this.createCriteria();
        criteria.add(Restrictions.eq(PropertyConstants.ESTADO_TRAZABLE, EstadoTrazable.PREPARADO));
        return this.select(criteria, resultConfig);
    }
}
