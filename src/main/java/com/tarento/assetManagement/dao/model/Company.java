package com.tarento.assetManagement.dao.model;

import javax.persistence.*;

@Entity
@Table(name = "companyDetails",schema = "assetManagement")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer branchId;
    private String companyName;
    private String description;
    private String location;
    private String branchName;


    public Company() {
    }

    public Company(String companyName, String description, String location, String branchName, Integer branchId) {
        this.companyName = companyName;
        this.description = description;
        this.location = location;
        this.branchName = branchName;
        this.branchId = branchId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }


}
