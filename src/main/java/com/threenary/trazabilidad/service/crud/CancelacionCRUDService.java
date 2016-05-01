package com.threenary.trazabilidad.service.crud;

import java.util.List;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.CancelacionDAO;
import com.threenary.trazabilidad.domain.Cancelacion;

/**
 * <h2>CancelacionCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>Cancelacion</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class CancelacionCRUDService extends
        AbstractGenericCRUDService<Cancelacion> {

    /** cancelacionDAO: un objeto de tipo <code>CancelacionDAO</code>*/
    private CancelacionDAO cancelacionDAO;

    /**
     * Constructor
     */
    public CancelacionCRUDService() {
        super();
    }

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>CancelacionDAO</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<Cancelacion> getMainDAO() {
        return this.getCancelacionDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la cancelacionDAO.
     */
    public CancelacionDAO getCancelacionDAO() {
        return cancelacionDAO;
    }

    /**
     * Setter
     * 
     * @param cancelacionDAO
     *            El/La cancelacionDAO para setear.
     */
    public void setCancelacionDAO(CancelacionDAO cancelacionDAO) {
        this.cancelacionDAO = cancelacionDAO;
    }

    /**
     * Recupera las instancias de las cancelaciones que aún no han
     * sido informados al SNTM
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @return una lista de objetos tipo <code>Cancelacion</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     * @fecha 22/10/2012
     */
    public List<Cancelacion> getCancelacionesPendientes(ResultConfig resultConfig) {
        return this.getCancelacionDAO().getCancelacionesPendientes(resultConfig);

    }

}
