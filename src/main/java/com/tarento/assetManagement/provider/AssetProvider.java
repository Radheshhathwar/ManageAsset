package com.tarento.assetManagement.provider;

import com.tarento.assetManagement.dao.dto.Asset;
import com.tarento.assetManagement.dao.mapper.AssetMapper;
import com.tarento.assetManagement.dao.repository.AssetRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AssetProvider {

    private static Logger logger = LogManager.getLogger(AssetProvider.class.getSimpleName());

@Autowired
    AssetMapper assetMapper;

    @Autowired
    private AssetRepository assetRepository;

    public Asset getUserDetails(Integer id) throws Exception {

        return assetMapper.map(assetRepository.getAssetById(id));
    }
}
