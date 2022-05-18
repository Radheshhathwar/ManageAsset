package com.tarento.assetManagement.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarento.assetManagement.dao.model.RequestAsset;

@Repository
public interface UserAssetRepository extends JpaRepository<RequestAsset, Integer>{
}
