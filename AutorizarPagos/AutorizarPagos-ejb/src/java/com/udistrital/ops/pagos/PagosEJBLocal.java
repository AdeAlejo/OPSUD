package com.udistrital.ops.pagos;

import com.udistrital.ops.modelo.pagos.Contratista;
import com.udistrital.ops.modelo.pagos.SolicitudPago;
import java.util.List;
import javax.ejb.Local;


@Local
public interface PagosEJBLocal {
	

    public void autorizarSolicitudPago(SolicitudPago solicitudPago);
    
    
    public List<SolicitudPago> ConsultarSolicitudes();
    
    
    public Contratista obtenerContratista(String identificacion);
    
    
    public SolicitudPago obtenerSolicitudPendiente(Contratista contratista);

}
