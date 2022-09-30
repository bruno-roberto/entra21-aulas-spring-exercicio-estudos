package br.com.entra21.spring.exercicio.estudos.Exercitando;

import java.sql.JDBCType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExercitandoApplication implements CommandLineRunner{
	

	@Autowired
	private JDBCType jdbc;

	public static void main(String[] args) {
		SpringApplication.run(ExercitandoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
