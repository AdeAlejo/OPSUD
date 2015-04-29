package com.udistrital.ops.view.pagos;

import com.udistrital.ops.modelo.pagos.Contratista;
import com.udistrital.ops.pagos.PagosEJBLocal;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "AutorizarSolicitudPagoList")
@ManagedBean
@SessionScoped
public class AutorizarSolicitudPagoList implements Serializable {
	
    @EJB
    private PagosEJBLocal pagosEJBLocal;
    
    
//    private Contratista contratista = new Contratista();

    public PagosEJBLocal getPagosEJBLocal() {
        return pagosEJBLocal;
    }

    public void setPagosEJBLocal(PagosEJBLocal pagosEJBLocal) {
        this.pagosEJBLocal = pagosEJBLocal;
    }


    
    public AutorizarSolicitudPagoList(){
        
    }
    
    @PostConstruct
    public void init(){
//        contratista = pagosEJBLocal.obtenerContratista("");
    }
    
    public String consultar() {

        HttpServletRequest origRequest = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        
        
        String id_document = (String)origRequest.getParameter("id_document");
                
        String social_security = (String)origRequest.getParameter("social_security");
                
        String account = (String)origRequest.getParameter("account");
        
        String management_report = (String)origRequest.getParameter("management_report");
        
        String payment_period = (String)origRequest.getParameter("payment_period");
        
        String digital_firm = (String)origRequest.getParameter("digital_firm");     
        
        if(id_document==null){
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", 
                        "Documentos incompletos, no puede continuar el proceso sin confirmar todos los documentos."));
            return "invalido";
        }
        
        if(social_security==null){
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", 
                        "Documentos incompletos, no puede continuar el proceso sin confirmar todos los documentos."));
            return "invalido";
        }   
        
        if(account==null){
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", 
                        "Documentos incompletos, no puede continuar el proceso sin confirmar todos los documentos."));
            return "invalido";
        }  
        
        if(management_report==null){
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", 
                        "Documentos incompletos, no puede continuar el proceso sin confirmar todos los documentos."));
            return "invalido";
        }  

        if(payment_period==null){
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", 
                        "Documentos incompletos, no puede continuar el proceso sin confirmar todos los documentos."));
            return "invalido";
        }         

        if(digital_firm==null){
            FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", 
                        "Documentos incompletos, no puede continuar el proceso sin confirmar todos los documentos."));
            return "invalido";
        }  
        
        
        return "valido";
    }
    
    
    
    public void autorizar() {
        
    }

    
//    public Contratista getContratista() {
//        return contratista;
//    }
//
//    public void setContratista(Contratista contratista) {
//        this.contratista = contratista;
//    }    
//    
    
}
