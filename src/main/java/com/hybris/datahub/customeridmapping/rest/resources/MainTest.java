package com.hybris.datahub.customeridmapping.rest.resources;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {  
        
	      AbstractApplicationContext  context =new  ClassPathXmlApplicationContext("classpath*:META-INF/*datahub-extension-spring.xml");  
	      
	      ServicesDemo  person = (ServicesDemo)context.getBean("servicesDemo");  
	      
	     System.out.println("sss:" + person);
	      
	} 
}
