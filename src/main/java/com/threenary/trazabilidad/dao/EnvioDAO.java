package com.threenary.trazabilidad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.threenary.generic.constants.PropertyConstants;
import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.trazabilidad.domain.Envio;

/**
 * <h2>EnvioDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>Envio</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 13/11/2012
 */
public class EnvioDAO extends AbstractDAO<Envio> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public EnvioDAO() {
        super(Envio.class);
    }

    /**
     * Devuelve los envios pendientes de ser informados al SNTM,
     * paginados y ordenados por el criterio recibido en la
     * configuración
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @return una lista de objetos tipo <code>Movimiento</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public List<Envio> getEnviosPendientes(ResultConfig resultConfig) {
        Criteria criteria = this.createCriteria();
        criteria.add(Restrictions.isNull(PropertyConstants.CODIGO_TRANSACCION));
        criteria.add(Restrictions.isNull(PropertyConstants.FECHA_TRANSACCION));
        if (resultConfig != null)
            return this.select(criteria, resultConfig);
        else
            return this.select(criteria);
    }

    /**
     * Obtiene todos los envios asociados al movimiento cuyo id se
     * recibe como parámetro
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @param idMovimiento
     *            <code>String</code> indicando el id del movimiento
     * @return una lista de objetos tipo <code>Movimiento</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public List<Envio> getEnviosDelMovimiento(ResultConfig resultConfig,
            Long idMovimiento) {
        Criteria criteria = this.createCriteria();
        criteria.add(Restrictions.eq(PropertyConstants.MOVIMIENTO_ID,
                idMovimiento));
        return this.select(criteria, resultConfig);
    }
}
