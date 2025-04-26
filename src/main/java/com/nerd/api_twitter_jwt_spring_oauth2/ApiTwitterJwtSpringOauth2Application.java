package com.nerd.api_twitter_jwt_spring_oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class ApiTwitterJwtSpringOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiTwitterJwtSpringOauth2Application.class, args);
	}

}
