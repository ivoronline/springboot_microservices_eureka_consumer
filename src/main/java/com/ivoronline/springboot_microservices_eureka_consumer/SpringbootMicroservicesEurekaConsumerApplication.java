package com.ivoronline.springboot_microservices_eureka_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class SpringbootMicroservicesEurekaConsumerApplication {

  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }

  public static void main(String[] args) throws URISyntaxException {
    SpringApplication.run(SpringbootMicroservicesEurekaConsumerApplication.class, args);
  }

}
