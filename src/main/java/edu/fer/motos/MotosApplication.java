package edu.fer.motos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MotosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			// Código a ejecutar al inicio de la aplicación
			System.out.println("La aplicación ha iniciado correctamente.");
		};
	}
}
