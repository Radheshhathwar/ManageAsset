package com.tarento.assetManagement.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarento.assetManagement.dao.model.RequestAsset;
import com.tarento.assetManagement.dao.repository.UserAssetRepository;

@Service
public class UserProvider {

	@Autowired
	UserAssetRepository userRepository;
	
	public void requestAsset(RequestAsset request){
		userRepository.save(request);
	}
}
