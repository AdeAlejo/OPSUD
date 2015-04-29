/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.modelo.pagos;

import com.udistrital.ops.autorizarPagosComponent.FirmaDigital;

/**
 *
 * @author VARIOS INVITADOS
 */
public abstract class Documento
{
     
    public FirmaDigital  ValidarFirmaDigital()
    {
       return new FirmaDigital();    
    }
}

