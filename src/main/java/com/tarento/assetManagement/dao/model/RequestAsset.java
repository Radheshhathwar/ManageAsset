package com.tarento.assetManagement.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;


@Entity
@Builder
public class RequestAsset {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestId;
	private Integer userId;
	private String type;
	private String description;
	private String managerEmail;
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getManagerEmail() {
		return managerEmail;
	}
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	public RequestAsset(Integer requestId, Integer userId, String type, String description, String managerEmail) {
		this.requestId = requestId;
		this.userId = userId;
		this.type = type;
		this.description = description;
		this.managerEmail = managerEmail;
	}
//	public static Object builder() {
//		
//		return null;
//	}
}
