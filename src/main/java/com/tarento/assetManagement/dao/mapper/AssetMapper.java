package com.tarento.assetManagement.dao.mapper;

import org.mapstruct.Mapper;

import com.tarento.assetManagement.dao.dto.Asset;

@Mapper(componentModel = "spring")
public interface AssetMapper {
   Asset map(com.tarento.assetManagement.dao.model.Asset asset);
}
