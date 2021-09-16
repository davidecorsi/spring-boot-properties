package it.partec.springbootproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.partec.springbootproperties.configuration.ConfigProperties;

@Component
public class Runner implements CommandLineRunner {
	

	@Value("${protocol}")
	private String protocol;
	
	@Autowired
	private ConfigProperties configProperties;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(configProperties.getHost());
		System.out.println(configProperties.getPort());
		System.out.println(configProperties.getFrom());
		System.out.println(configProperties.getDefaultRecipients());
		System.out.println(configProperties.getAdditionalHeaders());
		System.out.println(configProperties.getCredentials().getUsername());
		System.out.println(configProperties.getCredentials().getPassword());
		System.out.println(configProperties.getCredentials().getAuthMethod());
		System.out.println(protocol);
	}
}
