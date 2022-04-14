package com.tarento.assetManagement.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAsset {
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
    private Date purchaseDate;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name="warrantyExists",nullable = false)
    private boolean warrantyExists;
    @Column(name = "warrantyEndDate",nullable = false)
    private Date warrantyEndDate;
    @Column(name = "owner",nullable = false)
    private Integer owner;
}
