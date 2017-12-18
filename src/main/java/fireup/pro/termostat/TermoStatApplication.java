package fireup.pro.termostat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TermoStatApplication {

	public static void main(String[] args) {
		SpringApplication.run(TermoStatApplication.class, args);
	}
}
