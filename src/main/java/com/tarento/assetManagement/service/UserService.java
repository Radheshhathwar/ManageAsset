package com.tarento.assetManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarento.assetManagement.dao.model.RequestAsset;
import com.tarento.assetManagement.provider.UserProvider;

@Service
public class UserService {
	
	@Autowired
	UserProvider provider;
	
	public void requestAsset(RequestAsset request) throws Exception{
        provider.requestAsset(request);
    }
}
