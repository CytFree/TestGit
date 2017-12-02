package com.test.spring.executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

public class TestService {

	@Autowired
	private TaskExecutor taskExecutor;
	
	public void executorTask(Runnable runnable, int i){
		taskExecutor.execute(runnable);
		System.out.println("add messTask" + i);
	}
	
}
