package com.tarento.assetManagement.dao.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Audit {

	private Integer id;
	private Integer assetId;
	private Date auditDate;
	private Integer auditedBy;
	private String comment;
}
