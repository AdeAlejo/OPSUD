/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.modelo.pagos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos_182
 */
@Entity
@Table(name = "Contrato")
//@NamedQueries({
//    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
//    @NamedQuery(name = "Contrato.findByConId", query = "SELECT c FROM Contrato c WHERE c.conId = :conId"),
//    @NamedQuery(name = "Contrato.findByConSalario", query = "SELECT c FROM Contrato c WHERE c.conSalario = :conSalario"),
//    @NamedQuery(name = "Contrato.findByConFechaInicio", query = "SELECT c FROM Contrato c WHERE c.conFechaInicio = :conFechaInicio"),
//    @NamedQuery(name = "Contrato.findByConFechaFin", query = "SELECT c FROM Contrato c WHERE c.conFechaFin = :conFechaFin")})
public class Contrato implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "conId")
    private Integer conId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conSalario")
    private double conSalario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "conFechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conFechaInicio;
    @Column(name = "conFechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conFechaFin;
    

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoContrato conTipotcoId;
    
////    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empContratoconId", fetch = FetchType.EAGER)
////    private Collection<Contratista> empleadoCollection;

    public Contrato() {
    }

    public Contrato(Integer conId) {
        this.conId = conId;
    }

    public Contrato(Integer conId, double conSalario, Date conFechaInicio) {
        this.conId = conId;
        this.conSalario = conSalario;
        this.conFechaInicio = conFechaInicio;
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public double getConSalario() {
        return conSalario;
    }

    public void setConSalario(double conSalario) {
        this.conSalario = conSalario;
    }

    public Date getConFechaInicio() {
        return conFechaInicio;
    }

    public void setConFechaInicio(Date conFechaInicio) {
        this.conFechaInicio = conFechaInicio;
    }

    public Date getConFechaFin() {
        return conFechaFin;
    }

    public void setConFechaFin(Date conFechaFin) {
        this.conFechaFin = conFechaFin;
    }

    public TipoContrato getConTipotcoId() {
        return conTipotcoId;
    }

    public void setConTipotcoId(TipoContrato conTipotcoId) {
        this.conTipotcoId = conTipotcoId;
    }

////    @XmlTransient
////    public Collection<Contratista> getEmpleadoCollection() {
////        return empleadoCollection;
////    }
////
////    public void setEmpleadoCollection(Collection<Contratista> empleadoCollection) {
////        this.empleadoCollection = empleadoCollection;
////    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conId != null ? conId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.conId == null && other.conId != null) || (this.conId != null && !this.conId.equals(other.conId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udistrital.ops.modelo.Contrato[ conId=" + conId + " ]";
    }
    
}
