package com.tarento.assetManagement.dao.model;

import org.hibernate.mapping.List;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "auditDetails",schema = "assetManagement")
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date auditDate;
    private Integer auditedBy;
    private String comment;


    public Audit() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getAuditedBy() {
        return auditedBy;
    }

    public void setAuditedBy(Integer auditedBy) {
        this.auditedBy = auditedBy;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Audit(Integer id, Date auditDate, Integer auditedBy, String comment) {
        this.id = id;
        this.auditDate = auditDate;
        this.auditedBy = auditedBy;
        this.comment = comment;
    }
}
