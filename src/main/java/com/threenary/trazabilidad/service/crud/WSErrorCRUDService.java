package com.threenary.trazabilidad.service.crud;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.WSErrorDAO;
import com.threenary.trazabilidad.domain.WSError;


/**
 * <h2>WSErrorCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>WSError</code>.
 *
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a href="mailto:gsullain@mbsoftsa.com.ar">gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class WSErrorCRUDService extends AbstractGenericCRUDService<WSError> {
    
    /** wsErrorDAO un objeto de tipo <code>WSErrorDAO</code>*/
    private WSErrorDAO wsErrorDAO;

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>WSError</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<WSError> getMainDAO() {
        return this.getWsErrorDAO();
    }

    /**
     * Getter
     *
     * @return Retorna el/la wsErrorDAO.
     */
    public WSErrorDAO getWsErrorDAO() {
        return wsErrorDAO;
    }

    /**
     * Setter
     *
     * @param wsErrorDAO El/La wsErrorDAO para setear.
     */
    public void setWsErrorDAO(WSErrorDAO wsErrorDAO) {
        this.wsErrorDAO = wsErrorDAO;
    }
    
    
    
    

}
