package com.threenary.trazabilidad.dao;

import org.springframework.stereotype.Repository;

import com.threenary.generic.dao.AbstractDAO;
import com.threenary.trazabilidad.domain.Medicamento;

/**
 * <h2>MedicamentoDAO</h2><br>
 * Data Access Object que tiene la responsabilidad de recuperar y
 * persistir instancias de <code>Medicamento</code>.
 * 
 * @version 1.0
 * @author Gonzalo Gómez Sullain <a
 *         href="mailto:gsullain@mbsoftsa.com.ar"
 *         >gsullain@mbsoftsa.com.ar</a>
 * @fecha 11/10/2012
 */
@Repository
public class MedicamentoDAO extends AbstractDAO<Medicamento> {

    /**
     * Constructor <br>
     * Instancia la clase y setea el 'persistentClassName'
     */
    public MedicamentoDAO() {
        super(Medicamento.class);
    }

}
