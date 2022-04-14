package com.tarento.assetManagement.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tarento.assetManagement.dao.model.Asset;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {
	Asset getAssetById(Integer id);
	List<Asset> getAssetByStatus(String status);
}
