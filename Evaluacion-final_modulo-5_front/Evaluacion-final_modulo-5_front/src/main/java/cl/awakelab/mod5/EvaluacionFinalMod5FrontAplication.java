package cl.awakelab.mod5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EvaluacionFinalMod5FrontAplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionFinalMod5FrontAplication.class, args);
	}
	
	@Bean
	public RestTemplate restTenplate() {
		return new RestTemplate();
	}


}
