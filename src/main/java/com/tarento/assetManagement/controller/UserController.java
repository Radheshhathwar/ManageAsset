package com.tarento.assetManagement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarento.assetManagement.dao.model.RequestAsset;
import com.tarento.assetManagement.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController{
	
	private static final Logger logger = LogManager.getLogger(UserController.class.getSimpleName());
	
	@Autowired
	UserService userService;
	
	@PostMapping("asset/request")
	public ResponseEntity<String> assetRequest(@RequestBody RequestAsset request) {
		logger.info("Enter into RequestAsset API");
		try {
			 userService.requestAsset(request);
			return ResponseEntity.ok("Successfully raised request");
		}catch (Exception e) {
			e.fillInStackTrace();
		}
		return ResponseEntity.notFound().build();
	}
}