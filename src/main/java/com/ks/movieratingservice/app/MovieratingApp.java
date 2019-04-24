package com.ks.movieratingservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ks.movieratingservice.DAO.MovieRatingDAO;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.ks.movieratingservice")
public class MovieratingApp {

	public static void main(String[] args) { 
		SpringApplication.run(MovieratingApp.class, args);
	}
	
	

}
