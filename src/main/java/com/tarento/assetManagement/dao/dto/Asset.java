package com.tarento.assetManagement.dao.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {

	private Integer id;
	private String type;//enum vales
	private String description;
	private String brandName;
	private String uniqueNumber;
	private String modelNumber;
	private Date purchaseDate;
	private String status;//enum values
	private boolean warrantyExists;
	private Date warrantyEndDate;
	private Integer owner;
}
