package com.tarento.assetManagement.controller;

import com.tarento.assetManagement.dao.dto.Asset;
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
@RequestMapping("/admin")
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
			logger.info("Enter into Get asset Details");
			try {
				com.tarento.assetManagement.dao.dto.Asset asset = assetService.getAssetDetails(id);
				if (asset != null) {
					return ResponseEntity.ok(asset);
				}
			} catch (Exception E) {
//				E.printStackTrace();
				System.out.println("Error while asset");
			}
			return ResponseEntity.notFound().build();
		}
}
