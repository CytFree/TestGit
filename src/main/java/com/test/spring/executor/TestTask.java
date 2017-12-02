package com.test.spring.executor;

public class TestTask implements Runnable{
	private String mess;
	
	public TestTask() {
		// TODO Auto-generated constructor stub
	}
	
	public TestTask(String mess){
		this.mess = mess;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(5 *1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("mess : " + mess);
	}

}
