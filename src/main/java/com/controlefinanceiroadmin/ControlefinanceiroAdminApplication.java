package com.controlefinanceiroadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class ControlefinanceiroAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlefinanceiroAdminApplication.class, args);
	}

}
