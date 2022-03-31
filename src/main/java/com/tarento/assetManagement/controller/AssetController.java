package com.tarento.assetManagement.controller;

import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.service.AssetService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/org/admin")
public class AssetController {
		
		private static Logger logger = LogManager.getLogger(AssetController.class.getSimpleName());

		@Autowired
		private AssetService assetService;
		/**
		 * This api will get all the asset of the particular user
		 * @param id -- user id whose asset list is to be displayed
		 * @return
		 */
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
}
