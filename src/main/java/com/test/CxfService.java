package com.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CxfService {

	@WebMethod
	public String helloWorld(String name);
	
}
