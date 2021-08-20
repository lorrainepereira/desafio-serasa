package br.com.desafio.serasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SerasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerasaApplication.class, args);
	}

}
