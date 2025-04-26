package com.nerd.api_twitter_jwt_spring_oauth2.repository;

import com.nerd.api_twitter_jwt_spring_oauth2.entities.Tweet;
import com.nerd.api_twitter_jwt_spring_oauth2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TweetRepository extends JpaRepository<Tweet, Long>{

}
