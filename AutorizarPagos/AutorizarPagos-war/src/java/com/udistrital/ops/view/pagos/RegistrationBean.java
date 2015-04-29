
package com.udistrital.ops.view.pagos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RegistrationBean {

    public String saludo;
    public String nombre;
    public String apellido;
    public String edad;
    public String email;
    
    public RegistrationBean() {
       this.saludo = "";
       this.nombre = "";
       this.apellido = "";
       this.edad = "";
       this.email = "miemail";
    }
}