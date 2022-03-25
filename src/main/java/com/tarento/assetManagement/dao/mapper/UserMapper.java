package com.tarento.assetManagement.dao.mapper;

import org.mapstruct.Mapper;

import com.tarento.assetManagement.dao.dto.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User map(com.tarento.assetManagement.dao.model.User user);
}
