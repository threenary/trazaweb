package com.threenary.trazabilidad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.threenary.generic.constants.PropertyConstants;
import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.trazabilidad.domain.Cancelacion;

/**
 * <h2>CancelacionDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>Cancelacion</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gomez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class CancelacionDAO extends AbstractDAO<Cancelacion> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public CancelacionDAO() {
        super(Cancelacion.class);
    }

    /**
     * Devuelve los cancelaciones pendientes de ser informados al
     * SNTM, paginados y ordenados por el criterio recibido en la
     * configuración
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @return una lista de objetos tipo <code>Cancelacion</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     * @fecha 22/10/2012
     */
    public List<Cancelacion> getCancelacionesPendientes(
            ResultConfig resultConfig) {
        Criteria criteria = this.createCriteria();
        criteria.add(Restrictions.isNull(PropertyConstants.CODIGO_TRANSACCION));
        criteria.add(Restrictions.isNull(PropertyConstants.FECHA_TRANSACCION));
        if (resultConfig != null)
            return this.select(criteria, resultConfig);
        else
            return this.select(criteria);
    }

}
