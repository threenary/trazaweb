package com.threenary.trazabilidad.service.crud;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.WSUserDAO;
import com.threenary.trazabilidad.domain.WSUser;

/**
 * <h2>WSUserCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>WSUser</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class WSUserCRUDService extends AbstractGenericCRUDService<WSUser> {

    /** wsUserDAO un objeto de tipo <code>WSUserDAO</code> */
    private WSUserDAO wsUserDAO;

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>WSUser</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<WSUser> getMainDAO() {
        return this.getWsUserDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la wsUserDAO.
     */
    public WSUserDAO getWsUserDAO() {
        return wsUserDAO;
    }

    /**
     * Setter
     * 
     * @param wsUserDAO
     *            El/La wsUserDAO para setear.
     */
    public void setWsUserDAO(WSUserDAO wsUserDAO) {
        this.wsUserDAO = wsUserDAO;
    }
    
    /**
     * Retorna el usuario de validación para el SNTM
     * 
     * @return un objeto de tipo <code>WSUser</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public WSUser getWsUser(){
        return this.getAll().get(0);
    }

}
