/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.modelo.pagos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Carlos_182
 */
@Entity
@Table(name = "TipoContrato")
@NamedQueries({
    @NamedQuery(name = "TipoContrato.findAll", query = "SELECT t FROM TipoContrato t"),
    @NamedQuery(name = "TipoContrato.findByTcoId", query = "SELECT t FROM TipoContrato t WHERE t.tcoId = :tcoId"),
    @NamedQuery(name = "TipoContrato.findByTcoNombre", query = "SELECT t FROM TipoContrato t WHERE t.tcoNombre = :tcoNombre"),
    @NamedQuery(name = "TipoContrato.findByTcoIndefinido", query = "SELECT t FROM TipoContrato t WHERE t.tcoIndefinido = :tcoIndefinido")})
public class TipoContrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tcoId")
    private Long tcoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "tcoNombre")
    private String tcoNombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tcoIndefinido")
    private boolean tcoIndefinido;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conTipotcoId", fetch = FetchType.EAGER)
//    private Collection<Contrato> contratoCollection;

    public TipoContrato() {
    }

    public TipoContrato(Long tcoId) {
        this.tcoId = tcoId;
    }

    public TipoContrato(Long tcoId, String tcoNombre, boolean tcoIndefinido) {
        this.tcoId = tcoId;
        this.tcoNombre = tcoNombre;
        this.tcoIndefinido = tcoIndefinido;
    }

    public Long getTcoId() {
        return tcoId;
    }

    public void setTcoId(Long tcoId) {
        this.tcoId = tcoId;
    }

    public String getTcoNombre() {
        return tcoNombre;
    }

    public void setTcoNombre(String tcoNombre) {
        this.tcoNombre = tcoNombre;
    }

    public boolean getTcoIndefinido() {
        return tcoIndefinido;
    }

    public void setTcoIndefinido(boolean tcoIndefinido) {
        this.tcoIndefinido = tcoIndefinido;
    }
//
//    @XmlTransient
//    public Collection<Contrato> getContratoCollection() {
//        return contratoCollection;
//    }
//
//    public void setContratoCollection(Collection<Contrato> contratoCollection) {
//        this.contratoCollection = contratoCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tcoId != null ? tcoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoContrato)) {
            return false;
        }
        TipoContrato other = (TipoContrato) object;
        if ((this.tcoId == null && other.tcoId != null) || (this.tcoId != null && !this.tcoId.equals(other.tcoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udistrital.ops.modelo.TipoContrato[ tcoId=" + tcoId + " ]";
    }
    
}
