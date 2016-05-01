package com.threenary.trazabilidad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.threenary.generic.constants.PropertyConstants;
import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.trazabilidad.domain.AbstractTransaccion;

/**
 * <h2>TransaccionDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>Transaccion</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class AbstractTransaccionDAO extends AbstractDAO<AbstractTransaccion> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public AbstractTransaccionDAO() {
        super(AbstractTransaccion.class);
    }

    /**
     * Devuelve las transacciones que resultaron con errores al ser
     * informadas al SNTM, paginados y ordenados por el criterio
     * recibido en la configuración
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @return una lista de objetos tipo <code>Transaccion</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     * @fecha 22/10/2012
     */
    public List<AbstractTransaccion> getTransaccionesErroneas(
            ResultConfig resultConfig) {
        Criteria criteria = this.createCriteria();
        criteria.add(Restrictions.isNull(PropertyConstants.CODIGO_TRANSACCION));
        criteria.add(Restrictions.isNull(PropertyConstants.FECHA));
        criteria.add(Restrictions.isNotEmpty(PropertyConstants.ERRORES));
        return this.select(criteria, resultConfig);

    }

}
