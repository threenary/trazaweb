package com.threenary.trazabilidad.service.crud;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.AgenteDAO;
import com.threenary.trazabilidad.domain.Agente;

/**
 * <h2>AgenteCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>Agente</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class AgenteCRUDService extends AbstractGenericCRUDService<Agente> {

    /** agenteDAO un objeto de tipo <code>AgenteDAO</code> */
    private AgenteDAO agenteDAO;

    /**
     * Constructor
     */
    public AgenteCRUDService() {
        super();
    }

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>AgenteDAO</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<Agente> getMainDAO() {
        return this.getAgenteDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la agenteDAO.
     */
    public AgenteDAO getAgenteDAO() {
        return agenteDAO;
    }

    /**
     * Setter
     * 
     * @param agenteDAO
     *            El/La agenteDAO para setear.
     */
    public void setAgenteDAO(AgenteDAO agenteDAO) {
        this.agenteDAO = agenteDAO;
    }

}
