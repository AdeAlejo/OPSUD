/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.autorizarPagosComponent;

import com.udistrital.ops.modelo.pagos.CuentaBancaria;
import com.udistrital.ops.modelo.pagos.Funcionario;

/**
 *
 * @author VARIOS INVITADOS
 */
public abstract class Contratista extends Funcionario{
    String identificacion="";
    String nombre="";   


public CuentaBancaria ObtenerCuentaBancaria()
 {
    return new CuentaBancaria();
 }
}
