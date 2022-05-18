package com.tarento.assetManagement.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import com.tarento.assetManagement.dao.model.RequestAsset;
import com.tarento.assetManagement.service.UserService;

@RunWith(SpringRunner.class)
public class UserControllerTest {

	@Mock
	UserService service;

	@Test
	public void requestAssetSuccess() throws Exception {
		RequestAsset asset = new RequestAsset(1, 1, "Laptop", "New user", "abc@gmail.com");
		//Assertions.assertNotNull(service.requestAsset(asset));
	}

}
