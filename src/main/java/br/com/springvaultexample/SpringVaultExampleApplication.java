package br.com.springvaultexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class SpringVaultExampleApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringVaultExampleApplication.class);

	private Credential credential;

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultExampleApplication.class, args);
	}
	public SpringVaultExampleApplication(Credential credential){
		this.credential = credential;
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("----------------------------------------");
		logger.info("Data Configuration from Vault");
		logger.info("   username {}", credential.getUserName());
		logger.info("   password {}", credential.getPassword());
		logger.info("----------------------------------------");
	}
}
