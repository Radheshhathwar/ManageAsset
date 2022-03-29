package com.tarento.assetManagement.service;

import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.provider.AssetProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService {

    @Autowired
    AssetProvider assetProvider;

	public Asset getAssetDetails(Integer id) throws Exception {
        return assetProvider.getUserDetails(id);
    }
}
