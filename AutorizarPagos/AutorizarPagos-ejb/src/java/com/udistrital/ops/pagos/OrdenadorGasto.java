/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.pagos;

import com.udistrital.ops.autorizarPagosComponent.Aprobacion;
import com.udistrital.ops.autorizarPagosComponent.Notificacion;
import com.udistrital.ops.modelo.pagos.EstadosSolicitud;
import com.udistrital.ops.modelo.pagos.SolicitudPago;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author VARIOS INVITADOS
 */
@Stateless(mappedName = "OrdenadorGasto")
@LocalBean
public class OrdenadorGasto implements OrdenadorGastoLocal     {

    @PersistenceUnit
    private EntityManager em;
    

  
    public void AutorizadorPago(SolicitudPago solicitudpago)
    {
        solicitudpago = em.merge(solicitudpago);    
        solicitudpago.setSdpEstadoSolicitud(EstadosSolicitud.Aceptada.estado);
        
        solicitudpago.setSdpFechaModificacion(new Date());
        solicitudpago.setSdpUsuarioModificacion("dummie user");
        
        em.flush();
    }
    

    
    
    public Notificacion  GenerarNotificacion()
    {
        return  new Aprobacion();
    }

    public void NoAutorizarPago(SolicitudPago solicitudpago)
    {

    }


}
