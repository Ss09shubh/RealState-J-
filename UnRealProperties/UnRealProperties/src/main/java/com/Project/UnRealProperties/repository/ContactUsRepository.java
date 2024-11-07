package com.Project.UnRealProperties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.UnRealProperties.model.ContactUs;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Long> {
    // You can define custom query methods if needed
}
