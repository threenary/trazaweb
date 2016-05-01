package com.threenary.trazabilidad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.trazabilidad.domain.WSError;

/**
 * <h2>WSErrorDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>WSError</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class WSErrorDAO extends AbstractDAO<WSError> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public WSErrorDAO() {
        super(WSError.class);
    }
}
