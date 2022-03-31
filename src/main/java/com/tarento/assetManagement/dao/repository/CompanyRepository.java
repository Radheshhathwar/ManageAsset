package com.tarento.assetManagement.dao.repository;

import com.tarento.assetManagement.dao.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Company getById(Integer id);
}