package com.Project.UnRealProperties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.UnRealProperties.model.PayAVisit;

@Repository
public interface PayAVisitRepository extends JpaRepository<PayAVisit, Long> {
}