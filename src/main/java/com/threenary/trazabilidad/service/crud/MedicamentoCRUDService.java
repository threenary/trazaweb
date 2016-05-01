package com.threenary.trazabilidad.service.crud;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.generic.service.implementation.AbstractGenericCRUDService;
import com.threenary.trazabilidad.dao.MedicamentoDAO;
import com.threenary.trazabilidad.domain.Medicamento;

/**
 * <h2>MedicamentoCRUDService</h2><br>
 * Servicio CRUD para operaciones con <code>Medicamento</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
public class MedicamentoCRUDService extends
        AbstractGenericCRUDService<Medicamento> {

    /** medicamentoDAO un objeto de tipo <code>MedicamentoDAO</code>*/
    private MedicamentoDAO medicamentoDAO;

    /**
     * Sobreescribe el método de la superclase para devolver el DAO
     * principal, que manejará las operaciones de inserción,
     * actualización y borrado de objetos persistentes.
     * 
     * @return un objeto de tipo <code>Medicamento</code>
     * @see com.threenary.generic.service.implementation.AbstractGenericCRUDService#
     *      getMainDAO()
     */
    @Override
    public AbstractDAO<Medicamento> getMainDAO() {
        return this.getMedicamentoDAO();
    }

    /**
     * Getter
     * 
     * @return Retorna el/la medicamentoDAO.
     */
    public MedicamentoDAO getMedicamentoDAO() {
        return medicamentoDAO;
    }

    /**
     * Setter
     * 
     * @param medicamentoDAO
     *            El/La medicamentoDAO para setear.
     */
    public void setMedicamentoDAO(MedicamentoDAO medicamentoDAO) {
        this.medicamentoDAO = medicamentoDAO;
    }

}
