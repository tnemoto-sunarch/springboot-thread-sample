package jp.co.sunarch.sample.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadConfiguration {

	@Autowired
	private ThreadEnvConf threadEnvConf;
	
	@Bean
	public TaskExecutor taskExecutor() {
		ThreadEnvDetailConf conf = threadEnvConf.getThread1();
		
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(conf.getCorePoolSize());
		executor.setMaxPoolSize(conf.getMaxPoolSize());
		executor.setQueueCapacity(conf.getQueueCapacity());
		executor.setThreadNamePrefix(conf.getThreadNamePrefix());
		executor.initialize();
		return executor;
	}
	
	@Bean("thread2")
	public TaskExecutor taskExecutor2() {
		ThreadEnvDetailConf conf = threadEnvConf.getThread2();
		
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(conf.getCorePoolSize());
		executor.setMaxPoolSize(conf.getMaxPoolSize());
		executor.setQueueCapacity(conf.getQueueCapacity());
		executor.setThreadNamePrefix(conf.getThreadNamePrefix());
		executor.initialize();
		return executor;
	}

}
