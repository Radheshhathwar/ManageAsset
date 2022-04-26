package com.tarento.assetManagement.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarento.assetManagement.dao.dto.Assign;
import com.tarento.assetManagement.dao.dto.UpdateAsset;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.service.AssetService;

@RestController
@RequestMapping("/admin")
public class AdminController {
		
		private static final Logger logger = LogManager.getLogger(AdminController.class.getSimpleName());

		@Autowired
		private AssetService assetService;

		@GetMapping("/asset/{id}")
		public ResponseEntity<Asset> getAssetDetails(@PathVariable("id") Integer id) {
			logger.warn("Enter to get asset details");
			try {
				Asset asset = assetService.getAssetDetails(id);
				if (asset != null) {
					return ResponseEntity.ok(asset);
				}
			} catch (Exception exception) {
				logger.warn("Error while getting asset details");
				exception.fillInStackTrace();
			}
			return ResponseEntity.notFound().build();
		}

		@PostMapping("/asset/save")
		public ResponseEntity<Asset> saveAsset( @RequestBody Asset asset) {
			logger.info("Enter into Add Asset API");
			try {
				assetService.saveAsset(asset);
				logger.info("Successfully added asset");
				return ResponseEntity.ok(asset);
			} catch (Exception e) {
				logger.info("Failed to add asset");
				e.fillInStackTrace();
			}
			return ResponseEntity.notFound().build();
		}

		@GetMapping("/asset/problematic/{status}")
		public ResponseEntity<List<Asset>> getProblemeticAsset(@PathVariable("status") String status){
			logger.info("Enter into get Lost assets API");
			try {
				List<Asset> asset = assetService.getProblemeticAsset(status);
				logger.info("Successfully retrieved defect asset");
				return ResponseEntity.ok(asset);
			}catch (Exception e){
				logger.info("Failed to get lost asset");
				e.fillInStackTrace();
			}
			return ResponseEntity.notFound().build();
		}


		@PatchMapping("/asset/update/{id}")
		public ResponseEntity<Asset> updateAssetById(@PathVariable("id") Integer id, @RequestBody UpdateAsset updateAsset) {
			logger.info("Enter into Update Asset API");
			try {
				Asset asset = assetService.updateAssetById(id,updateAsset);
				logger.info("Successfully updated asset");
				return ResponseEntity.ok(asset);
			} catch (Exception e) {
				logger.info("Failed to update asset");
				e.fillInStackTrace();
			}
			return ResponseEntity.notFound().build();
		}

		@PostMapping("/asset/assign")
		public ResponseEntity<String> assignAsset(@RequestBody Assign assign){
			logger.info("Enter into Assign Asset API");
			try {
				assetService.assignAsset(assign);
				logger.info("Successfully assigned asset");
				return ResponseEntity.ok("Successfully assigned asset");
			} catch (Exception e) {
				logger.info("Failed to assign asset");
				e.fillInStackTrace();
			}
			return ResponseEntity.notFound().build();
		}
	//	@PostMapping("/asset/action")

}
