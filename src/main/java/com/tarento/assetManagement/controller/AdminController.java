package com.tarento.assetManagement.controller;

import com.tarento.assetManagement.dao.model.UpdateAsset;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.service.AssetService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
		
		private static final Logger logger = LogManager.getLogger(AdminController.class.getSimpleName());

		@Autowired
		private AssetService assetService;

		@GetMapping("/asset/{id}")
		public ResponseEntity<Asset> getAssetDetails(@PathVariable("id") Integer id) {
			logger.info("Enter to get asset details");
			try {
				com.tarento.assetManagement.dao.model.Asset asset = assetService.getAssetDetails(id);
				if (asset != null) {
					return ResponseEntity.ok(asset);
				}
			} catch (Exception E) {
				logger.info("Error while getting asset details");
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
			}
			return ResponseEntity.notFound().build();
		}

		@GetMapping("/asset/problematic/{status}")
		public ResponseEntity<List<Asset>> getLostDamagedAsset(@PathVariable("status") String status){
			logger.info("Enter into get Lost assets API");
			try{
				List<Asset> asset = assetService.getLostDamagedAsset(status);
				logger.info("Successfully got lost asset details");
				return ResponseEntity.ok(asset);
			}catch (Exception e){
				logger.info("Failed to get lost asset");
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
			}
			return ResponseEntity.notFound().build();
		}

	//	@PostMapping("/asset/assign")
	//	@PostMapping("/asset/action")
	//	@GetMapping("/asset/unAssigned")

}
