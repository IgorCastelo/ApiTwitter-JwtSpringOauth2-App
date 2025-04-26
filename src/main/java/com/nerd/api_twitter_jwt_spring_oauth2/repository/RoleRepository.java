package com.nerd.api_twitter_jwt_spring_oauth2.repository;

import com.nerd.api_twitter_jwt_spring_oauth2.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, Long > {
}

