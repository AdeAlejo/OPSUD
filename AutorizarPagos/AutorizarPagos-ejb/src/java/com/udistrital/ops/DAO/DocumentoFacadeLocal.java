/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.DAO;

import com.udistrital.ops.modelo.pagos.Documento;
import com.udistrital.ops.modelo.pagos.SolicitudPago;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface DocumentoFacadeLocal {
    
    
    public List<Documento> traerDocumentosPorSolicitud(SolicitudPago solicitudPago);
}
