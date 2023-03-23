package jp.co.sunarch.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringbootThreadSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThreadSampleApplication.class, args);
	}

}
