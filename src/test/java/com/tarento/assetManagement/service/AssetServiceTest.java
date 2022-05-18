package com.tarento.assetManagement.service;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.dao.repository.AssetRepository;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
public class AssetServiceTest {

	@InjectMocks
	AssetService assetService;

	@Mock
	AssetRepository assetRepository;

	private Asset asset = new Asset(1, "Laptop", "Good processing", "Dell", "123", "234", "31/12/1998", "Good", false,
			"31/12/1999", 2);

	@Test
	public void getAssetDetailsTestSuccess() throws Exception {
		int id = asset.getId();
		Assert.assertEquals(asset, when(assetService.getAssetDetails(id)).thenReturn(asset));
	}
}
