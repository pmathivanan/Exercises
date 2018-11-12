package org.mathivanan.springbasics;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object obj,String name){
		System.out.println(obj.getClass() +" "+ name);
	return obj;	
	}
	
	public Object postProcessAfterInitialization(Object obj,String name) {
		System.out.println(obj.getClass()  +" "+ name);
		return obj;
	}

}
