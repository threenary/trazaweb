package com.threenary.trazabilidad.dao;

import org.springframework.stereotype.Repository;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.trazabilidad.domain.Agente;

/**
 * <h2>AgenteDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>Agente</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gomez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class AgenteDAO extends AbstractDAO<Agente> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public AgenteDAO() {
        super(Agente.class);
    }

}
