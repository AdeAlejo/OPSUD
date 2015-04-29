/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.modelo.pagos;

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
 * @author Carlos_182
 */
@Entity
@Table(name = "Contratista")
//@NamedQueries({
//    @NamedQuery(name = "Contratista.findAll", query = "SELECT e FROM Contratista e"),
//    @NamedQuery(name = "Contratista.findByEmpCed", query = "SELECT e FROM Contratista e WHERE e.empCed = :empCed"),
//    @NamedQuery(name = "Contratista.findByEmpNombres", query = "SELECT e FROM Contratista e WHERE e.empNombres = :empNombres"),
//    @NamedQuery(name = "Contratista.findByEmpApellidos", query = "SELECT e FROM Contratista e WHERE e.empApellidos = :empApellidos"),
//    @NamedQuery(name = "Contratista.findByEmpFechaNacimiento", query = "SELECT e FROM Contratista e WHERE e.empFechaNacimiento = :empFechaNacimiento"),
//    @NamedQuery(name = "Contratista.findByEmpSexo", query = "SELECT e FROM Contratista e WHERE e.empSexo = :empSexo")})
public class Contratista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "empCed")
    private Long empCed;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "empNombres")
    private String empNombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "empApellidos")
    private String empApellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empFechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empFechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empSexo")
    private Character empSexo;
////    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sdpContratistaempCed", fetch = FetchType.EAGER)
////    private Collection<SolicitudPago> solicitudPagoCollection;
//    @JoinColumn(name = "empContrato_conId", referencedColumnName = "conId")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Contrato empContratoconId;

    public Contratista() {
    }

    public Contratista(Long empCed) {
        this.empCed = empCed;
    }

    public Contratista(Long empCed, String empNombres, String empApellidos, Date empFechaNacimiento, Character empSexo) {
        this.empCed = empCed;
        this.empNombres = empNombres;
        this.empApellidos = empApellidos;
        this.empFechaNacimiento = empFechaNacimiento;
        this.empSexo = empSexo;
    }

    public Long getEmpCed() {
        return empCed;
    }

    public void setEmpCed(Long empCed) {
        this.empCed = empCed;
    }

    public String getEmpNombres() {
        return empNombres;
    }

    public void setEmpNombres(String empNombres) {
        this.empNombres = empNombres;
    }

    public String getEmpApellidos() {
        return empApellidos;
    }

    public void setEmpApellidos(String empApellidos) {
        this.empApellidos = empApellidos;
    }

    public Date getEmpFechaNacimiento() {
        return empFechaNacimiento;
    }

    public void setEmpFechaNacimiento(Date empFechaNacimiento) {
        this.empFechaNacimiento = empFechaNacimiento;
    }

    public Character getEmpSexo() {
        return empSexo;
    }

    public void setEmpSexo(Character empSexo) {
        this.empSexo = empSexo;
    }

////    @XmlTransient
////    public Collection<SolicitudPago> getSolicitudPagoCollection() {
////        return solicitudPagoCollection;
////    }
////
////    public void setSolicitudPagoCollection(Collection<SolicitudPago> solicitudPagoCollection) {
////        this.solicitudPagoCollection = solicitudPagoCollection;
////    }

    public Contrato getEmpContratoconId() {
        return empContratoconId;
    }

    public void setEmpContratoconId(Contrato empContratoconId) {
        this.empContratoconId = empContratoconId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCed != null ? empCed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratista)) {
            return false;
        }
        Contratista other = (Contratista) object;
        if ((this.empCed == null && other.empCed != null) || (this.empCed != null && !this.empCed.equals(other.empCed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udistrital.ops.modelo.Contratista[ empCed=" + empCed + " ]";
    }
    
}
