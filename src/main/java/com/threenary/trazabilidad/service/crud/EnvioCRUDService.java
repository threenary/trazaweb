package com.threenary.trazabilidad.service.crud;

import java.util.List;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.dao.ResultConfig;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.EnvioDAO;
import com.threenary.trazabilidad.domain.Envio;

/**
 * <h2>EnvioCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>Envio</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 13/11/2012
 */
public class EnvioCRUDService extends AbstractGenericCRUDService<Envio> {

    private EnvioDAO envioDAO;

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>Envio</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<Envio> getMainDAO() {
        return this.getEnvioDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la movimientoDAO.
     */
    public EnvioDAO getEnvioDAO() {
        return envioDAO;
    }

    /**
     * Setter
     * 
     * @param movimientoDAO
     *            El/La movimientoDAO para setear.
     */
    public void setEnvioDAO(EnvioDAO envioDAO) {
        this.envioDAO = envioDAO;
    }

    /**
     * Recupera los envios que aún no han sido informados al SNTM
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @return una lista de objetos tipo <code>Movimiento</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public List<Envio> getEnviosPendientes(ResultConfig resultConfig) {
        return this.getEnvioDAO().getEnviosPendientes(resultConfig);
    }
    
    /**
     * Obtiene todos los envios asociados al movimiento cuyo id se
     * recibe como parámetro
     * 
     * @param resultConfig
     *            un objeto de tipo <code>ResultConfig</code>
     * @param idMovimiento
     *            <code>String</code> indicando el id del movimiento
     * @return una lista de objetos tipo <code>Movimiento</code>
     * @author Gonzalo Gomez Sullain <a
     *         href="mailto:gsullain@mbsoftsa.com.ar"
     *         >gsullain@mbsoftsa.com.ar</a>
     */
    public List<Envio> getEnviosDelMovimiento(ResultConfig resultConfig,
            Long idMovimiento) {
        return this.getEnvioDAO().getEnviosDelMovimiento(resultConfig,
                idMovimiento);
    }

}
