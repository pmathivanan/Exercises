package org.mathivanan.postprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object obj,String name){
		System.out.println(obj.getClass() +" before "+ name);
	return obj;	
	}
	
	public Object postProcessAfterInitialization(Object obj,String name) {
		System.out.println(obj.getClass()  +" after "+ name);
		return obj;
	}

}
