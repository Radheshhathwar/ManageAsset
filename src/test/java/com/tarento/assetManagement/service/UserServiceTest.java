package com.tarento.assetManagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.tarento.assetManagement.dao.model.RequestAsset;
import com.tarento.assetManagement.dao.repository.UserAssetRepository;

@RunWith(SpringRunner.class)
@TestInstance(Lifecycle.PER_CLASS)
public class UserServiceTest {
	
	private  UserAssetRepository repo;
	
	@Mock
	RequestAsset request;
	
	
	@BeforeAll
	   public  void setUp(){
		 repo = mock(UserAssetRepository.class);
	     request.setUserId(1);
	     request.setRequestId(1);
	     request.setType("Laptop");
	     request.setManagerEmail("abc@gmail.com");
	     request.setDescription("New user");
	     repo.save(request);
	}
	
	@Test
	void requestAssetTestSuccess() {
		assertEquals(repo.count(),1);
	}
	@AfterAll
		public void destroy() {
		repo.deleteAll();
	}
}
