package com.training.ms.cloud.netflixzuulgatwayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class NetflixZuulGatwayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulGatwayServerApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
		
	}
}
