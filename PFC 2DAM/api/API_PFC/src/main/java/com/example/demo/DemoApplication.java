package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * la siguiente clase es utilizada para la ejecucion de la api
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DemoApplication.class, args);
	}

}
