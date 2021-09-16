package it.partec.springbootproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("it.partec.springbootproperties.configuration")
public class SpringBootPropertiesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}
}
