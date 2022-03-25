package com.tarento.assetManagement.dao.mapper;

import org.mapstruct.Mapper;

import com.tarento.assetManagement.dao.dto.Company;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    Company map(com.tarento.assetManagement.dao.model.Company company);
}
