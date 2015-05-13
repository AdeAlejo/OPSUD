/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.modelo.pagos;

import com.udistrital.ops.autorizarPagosComponent.FirmaDigital;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author diego reyes
 */
@Entity
@Table(name = "Documento")
public abstract class Documento implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "archivo")
    private Byte archivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "firma")
    private Byte firma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    
    // Constructor
    public Documento(Byte archivo, Byte firma, String tipo) {
        this.archivo = archivo;
        this.firma = firma;
        this.tipo = tipo;
    }
    
    public FirmaDigital ValidarFirmaDigital()
    {
       // TODO Implements this method
       return new FirmaDigital();    
    }
    
    public Byte getArchivo() {
        return archivo;
    }

    public void setArchivo(Byte archivo) {
        this.archivo = archivo;
    }

    public Byte getFirma() {
        return firma;
    }

    public void setFirma(Byte firma) {
        this.firma = firma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.archivo != null ? this.archivo.hashCode() : 0);
        hash = 29 * hash + (this.firma != null ? this.firma.hashCode() : 0);
        hash = 29 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Documento other = (Documento) obj;
        if (this.archivo != other.archivo && (this.archivo == null || !this.archivo.equals(other.archivo))) {
            return false;
        }
        if (this.firma != other.firma && (this.firma == null || !this.firma.equals(other.firma))) {
            return false;
        }
        if ((this.tipo == null) ? (other.tipo != null) : !this.tipo.equals(other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Documento{" + "archivo=" + archivo + ", firma=" + firma + ", tipo=" + tipo + '}';
    }
    
}

