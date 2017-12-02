package com.test;

import javax.jws.WebService;

@WebService()
public class CxfServiceImpl implements CxfService{

	public String helloWorld(String name) {
		// TODO Auto-generated method stub
		return "Hello World " + name;
	}

}
