package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.executor.TestService;
import com.test.spring.executor.TestTask;

public class TestDemo { 
	    public static void main(String[] args) {  
	    	 ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//	    	 JaxWsProxyFactoryBean factory =  context.getBean(JaxWsProxyFactoryBean.class);  
	    	 
	    	 CxfService client = (CxfService)context.getBean("cxfServiceClient");
	    	 
//	    	 CxfService client = (CxfService)factory.create();  
		        String respone= client.helloWorld("cyt");  
		        System.out.println(respone);  
		        
//		        TestService testService = context.getBean(TestService.class);
//		        
//		        for(int i=0;i<20;i++){
//		        	TestTask testTask = new TestTask(i + "");
//		        	testService.executorTask(testTask, i);
//		        }
//		        
//		        System.out.println("main thread over!"); 
	    }  
	   

}
