package com.SpringCore.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	
	
	public static void main(String[] args) {
	
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/life/configlife.xml");
    samosa s=(samosa) context.getBean("beanlife");
	System.out.println(s);
	context.registerShutdownHook();
		
		
		
    }
}
