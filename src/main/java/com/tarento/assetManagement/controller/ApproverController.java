package com.tarento.assetManagement.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarento.assetManagement.dao.model.Action;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.service.ApproverService;

@RestController
@RequestMapping("/approver")
public class ApproverController {

	private static final Logger logger = LogManager.getLogger(ApproverController.class.getSimpleName());

	@Autowired
	ApproverService approverService;

	@PostMapping("/asset/manage")
	public ResponseEntity<String> manageAsset(@RequestBody Action action) {
		logger.info("Enter to manage asset request");
		try {
			approverService.manageAssetRequest(action);
			return ResponseEntity.ok("Successfully took action against asset request");
		} catch (Exception e) {
			logger.info("Error while managing request");
			e.fillInStackTrace();
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/asset/{projectId}")
	public ResponseEntity<List<Asset>> getAssetByProject(@PathVariable("projectId") Integer id) {
		logger.info("Enter to get asset for each project");
		try {
			List<Asset> asset = approverService.getAssetDetails(id);
			if (asset != null) {
				return ResponseEntity.ok(asset);
			}
		} catch (Exception E) {
			logger.info("Error while getting asset details");
		}
		return ResponseEntity.notFound().build();
	}
}
