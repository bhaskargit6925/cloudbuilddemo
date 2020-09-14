package com.gcp.cloudbuild;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CloudbuilddemoApplication {
	
	 @Value("${NAME:Nithwik}")
	  String name;

	  @RestController
	  class HelloworldController {
	    @GetMapping("/")
	    String hello() {	
	      return "Message from updated sp application, still welcoming you " + name + "!";
	    }
	  }

	public static void main(String[] args) {
		SpringApplication.run(CloudbuilddemoApplication.class, args);
	}

}
