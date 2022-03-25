package com.tarento.assetManagement.dao.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "assetDetails",schema = "assetManagement")
public class Asset implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private String type;//enum vales
    @Column(name ="description" )
    private String description;
    @Column(name ="brandName")
    private String brandName;
    @Column(name ="uniqueNumber")
    private String uniqueNumber;
    @Column(name ="modelNumber")
    private String modelNumber;
    @Column(name ="purchaseDate")
    private Date purchaseDate;
    @Column(name ="status")
    private String status;//enum values
    @Column(name ="warrantyExists")
    private Boolean warrantyExists;
    @Column(name ="warrantyEndDate")
    private Date warrantyEndDate;
    @Column(name ="owner")
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
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

    public Date getWarrantyEndDate() {
        return warrantyEndDate;
    }

    public void setWarrantyEndDate(Date warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Id " + getId() + " Type " + getType() + " Description " + getDescription() + " Model number " + getModelNumber() +
                " Unique number " + getUniqueNumber() + " Purchase date " + getPurchaseDate() + " Warranty exists "
                + getWarrantyExists() + " Warranty end date " + getWarrantyEndDate() + " Status " + getStatus() + " Owner " + getOwner();
    }
}


