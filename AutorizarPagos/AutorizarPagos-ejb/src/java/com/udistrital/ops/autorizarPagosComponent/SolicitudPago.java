/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.autorizarPagosComponent;

import com.udistrital.ops.modelo.pagos.Documento;
import com.udistrital.ops.modelo.pagos.PagoEps;
import com.udistrital.ops.modelo.pagos.PeriodoPago;

/**
 *
 * @author VARIOS INVITADOS
 */
public class SolicitudPago 
{
    int consecutivo=0;
    String Fecha="";
    double valor=0; 
    
public  Contrato ObtenerContrato()
{
    return  new Contrato();
}
public Documento ObtenerListadoDocumentos()
{
      return  new PagoEps();
    
}
public PeriodoPago  ValidarPeriodoPago()
{
       return new PeriodoPago();
    
}
public boolean  ValidarSaldo()
{
    return true;
}

}
