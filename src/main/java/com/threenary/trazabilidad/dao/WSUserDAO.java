package com.threenary.trazabilidad.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.trazabilidad.domain.WSUser;

/**
 * <h2>WSUsuarioDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>WSUser</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class WSUserDAO extends AbstractDAO<WSUser> {

    /**
     * Constructor Instancia la clase y setea el 'persistentClassName'
     */
    public WSUserDAO() {
        super(WSUser.class);
    }
}
