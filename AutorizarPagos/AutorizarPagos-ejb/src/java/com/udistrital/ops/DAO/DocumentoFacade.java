/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.DAO;

import com.udistrital.ops.modelo.pagos.Documento;
import com.udistrital.ops.modelo.pagos.SolicitudPago;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
public class DocumentoFacade extends AbstractFacade<Documento> implements DocumentoFacadeLocal {

    
    @PersistenceContext(unitName = "AutorizarPagos-ejbPU")
    private EntityManager entityManager;      
    
    
    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Documento> traerDocumentosPorSolicitud(SolicitudPago solicitudPago) {
       
        return entityManager.createQuery("Select documento From Documento documento "
                + "Where documento.solicitudPago = :parametroSolicitud ")
                .setParameter("parametroSolicitud", solicitudPago)
                .getResultList();
    }
    
    
}
