package com.aulaspring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulaspring.api.entity.MedicoEntity;

@Repository 
public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {
}