/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.view.pagos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Registration {

    private String eps;
    private String pension;
    private String ini_fecha;
    private String fin_fecha;
    private String cedula;
    private String nombre;
    private String cuenta;
    private String informe;

    public Registration() {
        this.eps = "";
        this.pension = "";
        this.ini_fecha = "";
        this.fin_fecha = "";
        this.cedula = "";
        this.nombre = "";
        this.cuenta = "";
        this.informe = "";
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getIni_fecha() {
        return ini_fecha;
    }

    public void setIni_fecha(String ini_fecha) {
        this.ini_fecha = ini_fecha;
    }

    public String getFin_fecha() {
        return fin_fecha;
    }

    public void setFin_fecha(String fin_fecha) {
        this.fin_fecha = fin_fecha;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
    
    /*
    private String saludo;
    private String nombre;
    private String apellido;
    private String edad;
    private String email;

    public Registration() {
        this.saludo = "";
        this.nombre = "";
        this.apellido = "";
        this.edad = "";
        this.email = "";
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    */

}