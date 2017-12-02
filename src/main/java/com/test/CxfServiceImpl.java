package com.test;

import javax.jws.WebService;

/**
 * @author cyt19930705
 * @date 2017/10/11
 */
@WebService()
public class CxfServiceImpl implements CxfService{

	/**
	 * helloWorld
	 * @param name
	 * @return
	 */
	@Override
	public String helloWorld(String name) {
		// TODO Auto-generated method stub
		return "Hello World " + name;
	}

}
