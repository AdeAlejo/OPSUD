/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.DAO;

import com.udistrital.ops.autorizarPagosComponent.Contrato;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
public class ContratoFacade extends AbstractFacade<Contrato> implements ContratoFacadeLocal {
    
    @PersistenceContext(unitName = "AutorizarPagos-ejbPU")
    private EntityManager entityManager;      

    
    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    
    @Override
    public Contrato obtenerPorId(int id) {
        return find(id);
    }
    

    
}
