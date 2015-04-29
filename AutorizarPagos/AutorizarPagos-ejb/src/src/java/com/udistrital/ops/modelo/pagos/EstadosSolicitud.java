/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.modelo.pagos;

/**
 *
 * @author Administrator
 */
public enum EstadosSolicitud {
        Pendiente(1),
        Aceptada(2),
        Rechazada(3);

        public int estado;

        EstadosSolicitud(int estado){
            this.estado = estado;
        }
}
