package com.threenary.trazabilidad.service.crud;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.TipoAgenteDAO;
import com.threenary.trazabilidad.domain.TipoAgente;

/**
 * <h2>TipoAgenteCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>TipoAgente</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class TipoAgenteCRUDService extends
        AbstractGenericCRUDService<TipoAgente> {

    /** tipoAgenteDAO un objeto de tipo <code>TipoAgenteDAO</code>*/
    private TipoAgenteDAO tipoAgenteDAO;

    /**
     * Constructor
     */
    public TipoAgenteCRUDService() {
        super();
    }

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>TipoAgenteDAO</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<TipoAgente> getMainDAO() {
        return this.getTipoAgenteDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la tipoAgenteDAO.
     */
    public TipoAgenteDAO getTipoAgenteDAO() {
        return tipoAgenteDAO;
    }

    /**
     * Setter
     * 
     * @param tipoAgenteDAO
     *            El/La tipoAgenteDAO para setear.
     */
    public void setTipoAgenteDAO(TipoAgenteDAO tipoAgenteDAO) {
        this.tipoAgenteDAO = tipoAgenteDAO;
    }

}
