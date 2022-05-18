package com.tarento.assetManagement.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.service.AssetService;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
public class AdminControllerTest {

	@InjectMocks
	AdminController adminController;

	@Mock
	AssetService service;

	@Mock
	Asset asset;

	@Test
	public void saveAssetTest() throws Exception {

		asset = new Asset(1, "Laptop", "Good processing", "Dell", "123", "234", "31/12/1998", "Good", false,
				"31/12/1999", 2);
		ResponseEntity<Asset> asset1 = adminController.saveAsset(asset);
		Assertions.assertEquals(200, asset1.getStatusCodeValue());
	}
}
