/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.autorizarPagosComponent;


/**
 *
 * @author VARIOS INVITADOS
 */
public  class Contrato {
    
    int numero=0;
    double valorcontrato=0;
public  Contratista ObtenerContratista()
 {
    return  new PersonaJuridica();
 }
  
 public RelacionPagos ObtenerRelacionGastos()
    {
     
     return new RelacionPagos();
    }
}