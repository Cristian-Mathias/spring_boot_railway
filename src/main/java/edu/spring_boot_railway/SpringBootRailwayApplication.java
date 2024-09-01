package edu.spring_boot_railway;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default server URL")})
@SpringBootApplication
public class SpringBootRailwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRailwayApplication.class, args);
	}

}
