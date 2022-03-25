package com.tarento.assetManagement.dao.repository;

import com.tarento.assetManagement.dao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User getById(Integer id);
}
