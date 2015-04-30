/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.modelo.pagos;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Size;

/**
 *
 * @author Carlos_182
 */
@Entity
@Table(name = "SolicitudPago")
//@NamedQueries({
//    @NamedQuery(name = "SolicitudPago.findAll", query = "SELECT s FROM SolicitudPago s"),
//    @NamedQuery(name = "SolicitudPago.findBySdpId", query = "SELECT s FROM SolicitudPago s WHERE s.sdpId = :sdpId"),
//    @NamedQuery(name = "SolicitudPago.findBySdpPeriodoPagoAnio", query = "SELECT s FROM SolicitudPago s WHERE s.sdpPeriodoPagoAnio = :sdpPeriodoPagoAnio"),
//    @NamedQuery(name = "SolicitudPago.findBySdpPeriodoPagoMes", query = "SELECT s FROM SolicitudPago s WHERE s.sdpPeriodoPagoMes = :sdpPeriodoPagoMes"),
//    @NamedQuery(name = "SolicitudPago.findBySdpFechaCreacion", query = "SELECT s FROM SolicitudPago s WHERE s.sdpFechaCreacion = :sdpFechaCreacion"),
//    @NamedQuery(name = "SolicitudPago.findBySdpUsuarioCreacion", query = "SELECT s FROM SolicitudPago s WHERE s.sdpUsuarioCreacion = :sdpUsuarioCreacion"),
//    @NamedQuery(name = "SolicitudPago.findBySdpEstadoSolicitud", query = "SELECT s FROM SolicitudPago s WHERE s.sdpEstadoSolicitud = :sdpEstadoSolicitud")})
public class SolicitudPago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "sdpId")
    private Long sdpId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sdpPeriodoPagoAnio")
    private int sdpPeriodoPagoAnio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sdpPeriodoPagoMes")
    private int sdpPeriodoPagoMes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sdpFechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdpFechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "sdpUsuarioCreacion")
    private String sdpUsuarioCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sdpEstadoSolicitud")
    private int sdpEstadoSolicitud;
    
    
    @Column(name = "sdpFechaModificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdpFechaModificacion;

    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "sdpUsuarioModificacion")
    private String sdpUsuarioModificacion;    
    
    
    @Column(name = "sdpValorSolicitud")
    private BigDecimal valorSolicitud = BigDecimal.ZERO;


    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Contratista sdpContratistaempCed;

    public SolicitudPago() {
    }

    public SolicitudPago(Long sdpId) {
        this.sdpId = sdpId;
    }

    public SolicitudPago(Long sdpId, int sdpPeriodoPagoAnio, int sdpPeriodoPagoMes, Date sdpFechaCreacion, String sdpUsuarioCreacion, int sdpEstadoSolicitud) {
        this.sdpId = sdpId;
        this.sdpPeriodoPagoAnio = sdpPeriodoPagoAnio;
        this.sdpPeriodoPagoMes = sdpPeriodoPagoMes;
        this.sdpFechaCreacion = sdpFechaCreacion;
        this.sdpUsuarioCreacion = sdpUsuarioCreacion;
        this.sdpEstadoSolicitud = sdpEstadoSolicitud;
    }

    public Long getSdpId() {
        return sdpId;
    }

    public void setSdpId(Long sdpId) {
        this.sdpId = sdpId;
    }

    public int getSdpPeriodoPagoAnio() {
        return sdpPeriodoPagoAnio;
    }

    public void setSdpPeriodoPagoAnio(int sdpPeriodoPagoAnio) {
        this.sdpPeriodoPagoAnio = sdpPeriodoPagoAnio;
    }

    public int getSdpPeriodoPagoMes() {
        return sdpPeriodoPagoMes;
    }

    public void setSdpPeriodoPagoMes(int sdpPeriodoPagoMes) {
        this.sdpPeriodoPagoMes = sdpPeriodoPagoMes;
    }

    public Date getSdpFechaCreacion() {
        return sdpFechaCreacion;
    }

    public void setSdpFechaCreacion(Date sdpFechaCreacion) {
        this.sdpFechaCreacion = sdpFechaCreacion;
    }

    public String getSdpUsuarioCreacion() {
        return sdpUsuarioCreacion;
    }

    public void setSdpUsuarioCreacion(String sdpUsuarioCreacion) {
        this.sdpUsuarioCreacion = sdpUsuarioCreacion;
    }

    public int getSdpEstadoSolicitud() {
        return sdpEstadoSolicitud;
    }

    public void setSdpEstadoSolicitud(int sdpEstadoSolicitud) {
        this.sdpEstadoSolicitud = sdpEstadoSolicitud;
    }


    public Date getSdpFechaModificacion() {
        return sdpFechaModificacion;
    }

    public void setSdpFechaModificacion(Date sdpFechaModificacion) {
        this.sdpFechaModificacion = sdpFechaModificacion;
    }

    public String getSdpUsuarioModificacion() {
        return sdpUsuarioModificacion;
    }

    public void setSdpUsuarioModificacion(String sdpUsuarioModificacion) {
        this.sdpUsuarioModificacion = sdpUsuarioModificacion;
    }

    public Contratista getSdpContratistaempCed() {
		return sdpContratistaempCed;
	}

	public void setSdpContratistaempCed(Contratista sdpContratistaempCed) {
		this.sdpContratistaempCed = sdpContratistaempCed;
	}
        
        
    public BigDecimal getValorSolicitud() {
        return valorSolicitud;
    }

    public void setValorSolicitud(BigDecimal valorSolicitud) {
        this.valorSolicitud = valorSolicitud;
    }
            

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (sdpId != null ? sdpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudPago)) {
            return false;
        }
        SolicitudPago other = (SolicitudPago) object;
        if ((this.sdpId == null && other.sdpId != null) || (this.sdpId != null && !this.sdpId.equals(other.sdpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udistrital.ops.modelo.SolicitudPago[ sdpId=" + sdpId + " ]";
    }
    
}
