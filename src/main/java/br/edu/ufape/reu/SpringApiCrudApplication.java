package br.edu.ufape.reu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApiCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appCtx = SpringApplication.run(SpringApiCrudApplication.class, args);
	}

}

