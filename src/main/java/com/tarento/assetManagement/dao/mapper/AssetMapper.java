package com.tarento.assetManagement.dao.mapper;

import com.tarento.assetManagement.dao.model.Asset;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AssetMapper {
   Asset map(Asset asset);
}