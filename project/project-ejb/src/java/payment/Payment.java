/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author diego
 */
@Entity
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String contractor;
    private String identification;
    private double value_payment;
    private boolean id_document;
    private boolean social_security;
    private boolean account;
    private String management_report;
    private boolean payment_period;
    private boolean digital_firm;

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getValue_payment() {
        return value_payment;
    }

    public void setValue_payment(double value_payment) {
        this.value_payment = value_payment;
    }

    public boolean isId_document() {
        return id_document;
    }

    public void setId_document(boolean id_document) {
        this.id_document = id_document;
    }

    public boolean isSocial_security() {
        return social_security;
    }

    public void setSocial_security(boolean social_security) {
        this.social_security = social_security;
    }

    public boolean isAccount() {
        return account;
    }

    public void setAccount(boolean account) {
        this.account = account;
    }

    public String getManagement_report() {
        return management_report;
    }

    public void setManagement_report(String management_report) {
        this.management_report = management_report;
    }

    public boolean isPayment_period() {
        return payment_period;
    }

    public void setPayment_period(boolean payment_period) {
        this.payment_period = payment_period;
    }

    public boolean isDigital_firm() {
        return digital_firm;
    }

    public void setDigital_firm(boolean digital_firm) {
        this.digital_firm = digital_firm;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "payment.Payment[ id=" + id + " ]";
    }
    
}
