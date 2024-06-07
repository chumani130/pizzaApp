package com.chumz.pizzaApp;

import com.chumz.pizzaApp.config.PizzaConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PizzaAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PizzaAppApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		final PizzaConfig pizzaConfig = new PizzaConfig(
				"tomato", "mozzarella", "thin"
		);

		log.info(
				String.format("I want a %s crust pizza, with %s and %s sauce",
						pizzaConfig.getCrust(),
						pizzaConfig.getTopping(),
						pizzaConfig.getSauce()
				));
	}
}
