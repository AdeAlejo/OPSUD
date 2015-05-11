/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.DAO;

import com.udistrital.ops.autorizarPagosComponent.Contrato;

/**
 *
 * @author Administrator
 */
public interface ContratoFacadeLocal {
    
    public Contrato obtenerPorId(int id);
    
}
