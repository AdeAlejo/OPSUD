/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.pagos;

import com.udistrital.ops.autorizarPagosComponent.Notificacion;
import com.udistrital.ops.modelo.pagos.SolicitudPago;


/**
 *
 * @author Administrator
 */
public interface OrdenadorGastoLocal {

    public void AutorizadorPago(SolicitudPago solicitudpago);

    public Notificacion GenerarNotificacion();

    public void NoAutorizarPago(SolicitudPago solicitudpago);
    
}
