package com.example.NetflixZullEurekha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class NetflixZullEurekhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZullEurekhaApplication.class, args);
	}

}
