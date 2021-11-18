package com.nttdata.desafiofinal.departamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class DepartamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartamentosApplication.class, args);
	}

}
