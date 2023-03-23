package jp.co.sunarch.sample.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootTest
public class ThreadServiceTest {

	@Autowired
	private ThreadService service;
	
	@Autowired
	private TaskExecutor taskExecutor;

	@Autowired
	@Qualifier("thread2")
	private TaskExecutor taskExecutor2;

	@Test
	void test1() {
		for (int i = 0; i < 10; i++) {
			service.exec1();
		}
		assertEquals(2, ((ThreadPoolTaskExecutor)taskExecutor).getActiveCount());
	}
	
	@Test
	void test2() {
		for (int i = 0; i < 10; i++) {
			service.exec2();
		}
		assertEquals(5, ((ThreadPoolTaskExecutor)taskExecutor2).getActiveCount());
	}

}
