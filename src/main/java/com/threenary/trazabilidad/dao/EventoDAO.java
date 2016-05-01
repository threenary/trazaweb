package com.threenary.trazabilidad.dao;

import org.springframework.stereotype.Repository;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.trazabilidad.domain.Evento;

/**
 * <h2>EventoDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>Evento</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class EventoDAO extends AbstractDAO<Evento> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public EventoDAO() {
        super(Evento.class);
    }
}
