package com.tarento.assetManagement.dao.model;


import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@DynamicUpdate
@Table(name = "assetDetails",schema = "assetManagement")
public class Asset implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false,updatable = false)
    private Integer id;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "brandName", nullable = false,updatable = false)
    private String brandName;
    @Column(name = "uniqueNumber", nullable = false,updatable = false)
    private String uniqueNumber;
    @Column(name = "modelNumber", nullable = false,updatable = false)
    private String modelNumber;
    @Column(name = "purchaseDate", nullable = false,updatable = false)
    private String purchaseDate;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name="warrantyExists",nullable = false)
    private boolean warrantyExists;
    @Column(name = "warrantyEndDate",nullable = false)
    private String warrantyEndDate;
    @Column(name = "owner",nullable = false)
    private Integer owner;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getWarrantyExists() {
        return warrantyExists;
    }

    public void setWarrantyExists(Boolean warrantyExists) {
        this.warrantyExists = warrantyExists;
    }

    public String getWarrantyEndDate() {
        return warrantyEndDate;
    }

    public void setWarrantyEndDate(String warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

	public Asset(Integer id, String type, String description, String brandName, String uniqueNumber, String modelNumber,
			String purchaseDate, String status, boolean warrantyExists, String warrantyEndDate, Integer owner) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.brandName = brandName;
		this.uniqueNumber = uniqueNumber;
		this.modelNumber = modelNumber;
		this.purchaseDate = purchaseDate;
		this.status = status;
		this.warrantyExists = warrantyExists;
		this.warrantyEndDate = warrantyEndDate;
		this.owner = owner;
	}
    
}


