package com.tarento.assetManagement.dao.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "auditDetails",schema = "assetManagement")
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;
    @Column(name="assetId")
    private Integer assetId;
    @Column(name = "auditDate")
    private Date auditDate;
    @Column(name="auditedBy")
    private Integer auditedBy;
    @Column(name = "comment")
    private String comment;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAssetId() {
		return assetId;
	}
	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
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
}

