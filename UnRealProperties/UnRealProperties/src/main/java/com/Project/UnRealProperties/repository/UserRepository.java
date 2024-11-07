package com.Project.UnRealProperties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Project.UnRealProperties.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}