package com.udistrital.ops.view.pagos;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.primefaces.context.RequestContext;

@Named(value = "AutorizarSolicitudPagoList")
@ManagedBean
@SessionScoped
public class AutorizarSolicitudPagoList implements Serializable {
	
	
    
    public AutorizarSolicitudPagoList(){
        
    }
    
    public void consultar() {

        
        HttpServletRequest origRequest = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        
        System.out.println((String)origRequest.getParameter("id_document"));


    }
    
    
    
    public void autorizar() {
        
    }

}
