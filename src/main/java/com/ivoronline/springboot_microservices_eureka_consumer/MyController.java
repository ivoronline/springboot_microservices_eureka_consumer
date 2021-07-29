package com.ivoronline.springboot_microservices_eureka_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class MyController {

  @Autowired RestTemplate restTemplate;

  @RequestMapping("Hello")
  String hello() throws URISyntaxException {

    //CALL MICROSERVICE
    String result = restTemplate.getForObject(new URI("http://hello-service/Hello"), String.class);

    //RETURN SOMETHING
    return result;
    
  }

}
