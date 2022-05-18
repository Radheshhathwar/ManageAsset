package com.tarento.assetManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarento.assetManagement.dao.model.Action;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.dao.repository.AssetRepository;
import com.tarento.assetManagement.dao.repository.UserRepository;

@Service
public class ApproverService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AssetRepository assetRepository;	
	
	public void manageAssetRequest(Action action) {
		userRepository.save(action);
	}
	public List<Asset> getAssetDetails(Integer projectId) throws Exception {
		return assetRepository.getAssetByOwner(projectId);
	}
}
