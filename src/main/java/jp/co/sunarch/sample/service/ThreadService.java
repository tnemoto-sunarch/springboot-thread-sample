package jp.co.sunarch.sample.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ThreadService {

	@Async
	public void exec1() {
		try {
			log.info("ThreadService.exec1 start");
			Thread.sleep(5000);
			log.info("ThreadService.exec1 end");
		} catch(InterruptedException e) {
			log.info("thread stopped.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Async("thread2")
	public void exec2() {
		try {
			log.info("ThreadService.exec2 start");
			Thread.sleep(5000);
			log.info("ThreadService.exec2 end");
		} catch(InterruptedException e) {
			log.info("thread stopped.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
