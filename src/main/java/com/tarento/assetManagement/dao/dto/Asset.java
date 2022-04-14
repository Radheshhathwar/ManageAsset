package com.tarento.assetManagement.dao.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {

	private Integer id;
	private String type;
	private String description;
	private String brandName;
	private String uniqueNumber;
	private String modelNumber;
	private Date purchaseDate;
	private String status;
	private boolean warrantyExists;
	private Date warrantyEndDate;
	private Integer owner;
}
