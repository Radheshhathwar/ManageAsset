package com.tarento.assetManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarento.assetManagement.dao.model.Action;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.provider.ApproverProvider;

@Service
public class ApproverService {

	@Autowired
	ApproverProvider approverProvider;

	public void manageAssetRequest(Action action) throws Exception {
		approverProvider.manageAssetRequest(action);
	}

	public List<Asset> getAssetDetails(Integer projectId) throws Exception {
		return approverProvider.getAssetDetails(projectId);
	}
}
