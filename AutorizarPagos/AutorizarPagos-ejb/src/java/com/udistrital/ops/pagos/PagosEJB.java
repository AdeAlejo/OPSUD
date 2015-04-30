package com.udistrital.ops.pagos;

import com.udistrital.ops.modelo.pagos.Contratista;
import com.udistrital.ops.modelo.pagos.EstadosSolicitud;
import com.udistrital.ops.modelo.pagos.SolicitudPago;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class PagosEJB
 */
@Stateless(mappedName = "PagosEJB")
@LocalBean
public class PagosEJB implements PagosEJBLocal {


    @PersistenceContext(unitName = "AutorizarPagos-ejbPU")
    private EntityManager em;      
    
    /**
     * Default constructor. 
     */
    public PagosEJB() {
        // TODO Auto-generated constructor stub
    }
    
    
    public List<SolicitudPago> ConsultarSolicitudes()
    {
        
        List<SolicitudPago> solicitudesPendientes =
                em.createQuery("Select s from SolicitudPago s Where s.sdpEstadoSolicitud = :estado ")
                .setParameter("estado",EstadosSolicitud.Pendiente.estado)
                .getResultList();
                
        return solicitudesPendientes;
        
    }
    
    
    public Contratista obtenerContratista(String identificacion) {
        return em.find(Contratista.class, 1L);
    }
    
    
    public void autorizarSolicitudPago(SolicitudPago solicitudPago) {
        
        

    }
    
    
    public SolicitudPago obtenerSolicitudPendiente(Contratista contratista) {
        
        try {
            return (SolicitudPago)em.createQuery("Select s from SolicitudPago s Where s.sdpEstadoSolicitud = :estado "
                        + "And s.sdpContratistaempCed = :contratista ")
                        .setParameter("estado",EstadosSolicitud.Pendiente.estado)
                        .setParameter("contratista",contratista)
                        .getSingleResult();            
        } catch(NoResultException nre) {
            return new SolicitudPago();
        }

    }

}
