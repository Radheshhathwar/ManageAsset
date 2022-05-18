package com.tarento.assetManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarento.assetManagement.dao.model.RequestAsset;
import com.tarento.assetManagement.dao.repository.UserAssetRepository;

@Service
public class UserService {

	@Autowired
	UserAssetRepository userRepository;
	
	public void requestAsset(RequestAsset request){
		userRepository.save(request);
	}
}
