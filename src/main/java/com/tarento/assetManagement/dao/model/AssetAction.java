package com.tarento.assetManagement.dao.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "assetAction",schema = "assetManagement")
public class AssetAction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "actionId",nullable = false, updatable = false)
	private Integer actionId;
	private Integer assetId;
	private Integer userId;
	private Date eventDate;
	private String description;
	private String action;
	private Boolean isResolved;
	private Integer resolvedBy;
	private String closingDetails;
}
