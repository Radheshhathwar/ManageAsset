package com.tarento.assetManagement.dao.mapper;

import org.mapstruct.Mapper;

import com.tarento.assetManagement.dao.dto.Audit;

@Mapper(componentModel = "spring")
public interface AuditMapper {
    Audit map(com.tarento.assetManagement.dao.model.Audit audit);
}
