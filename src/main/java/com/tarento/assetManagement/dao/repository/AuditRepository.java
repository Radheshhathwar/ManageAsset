package com.tarento.assetManagement.dao.repository;

import com.tarento.assetManagement.dao.model.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends JpaRepository<Audit, Integer> {
    Audit getById(Integer id);
}