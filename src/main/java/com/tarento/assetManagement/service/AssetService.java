package com.tarento.assetManagement.service;

import com.tarento.assetManagement.dao.dto.Assign;
import com.tarento.assetManagement.dao.dto.UpdateAsset;
import com.tarento.assetManagement.dao.model.Asset;
import com.tarento.assetManagement.provider.AssetProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class AssetService {

    @Autowired
    AssetProvider assetProvider;

	public Asset getAssetDetails(Integer id) throws Exception {
        return assetProvider.getAssetDetails(id);
    }

        public void saveAsset(Asset asset) throws Exception{
            assetProvider.saveAsset(asset);
        }
        public Asset updateAssetById(Integer id, UpdateAsset updateAsset) throws Exception {
            return assetProvider.updateAssetById(id,updateAsset);
        }
        public List<Asset> getProblemeticAsset(String status) throws Exception{
            return assetProvider.getProblemeticAsset(status);
        }
        public Asset assignAsset(Assign assign) {
        	return assetProvider.assignAsset(assign);
        }
    }
