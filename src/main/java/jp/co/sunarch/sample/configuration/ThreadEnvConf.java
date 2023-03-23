package jp.co.sunarch.sample.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "sample")
public class ThreadEnvConf {

	private ThreadEnvDetailConf thread1;
	
	private ThreadEnvDetailConf thread2;
}
