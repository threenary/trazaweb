package com.threenary.trazabilidad.service.crud;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.EventoDAO;
import com.threenary.trazabilidad.domain.Evento;

/**
 * <h2>EventoCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>Evento</code>.
 * 
 * @version 1.0
 * @author Gonzalo G�mez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class EventoCRUDService extends AbstractGenericCRUDService<Evento> {

    /** eventoDAO un objeto de tipo <code>EventoDAO</code>*/
    private EventoDAO eventoDAO;

    /**
     * Sobreescribe el m�todo de la superclase para devolver el DAO
     * principal, que manejar� las operaciones de inserci�n,
     * actualizaci�n y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>EventoDAO</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<Evento> getMainDAO() {
        return this.getEventoDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la eventoDAO.
     */
    public EventoDAO getEventoDAO() {
        return eventoDAO;
    }

    /**
     * Setter
     * 
     * @param eventoDAO
     *            El/La eventoDAO para setear.
     */
    public void setEventoDAO(EventoDAO eventoDAO) {
        this.eventoDAO = eventoDAO;
    }

}
