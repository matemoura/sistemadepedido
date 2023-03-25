package com.moura.sistemadepedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moura.sistemadepedidos.servicies.S3Service;

@SpringBootApplication
public class SistemadepedidosApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SistemadepedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
