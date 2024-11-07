package com.Project.UnRealProperties.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.UnRealProperties.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
