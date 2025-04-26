package com.nerd.api_twitter_jwt_spring_oauth2.repository;

import com.nerd.api_twitter_jwt_spring_oauth2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
