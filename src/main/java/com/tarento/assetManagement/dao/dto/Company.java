package com.tarento.assetManagement.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

	private Integer CompanyId;
	private String companyName;
	private String description;
	private String location;
	private String branchName;

}
