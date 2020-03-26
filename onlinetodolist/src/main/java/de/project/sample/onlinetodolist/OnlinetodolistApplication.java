package de.project.sample.onlinetodolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"de.project.sample.onlinetodolist"})
public class OnlinetodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinetodolistApplication.class, args);
	}

}
