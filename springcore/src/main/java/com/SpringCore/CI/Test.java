package com.SpringCore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.ref.A;

public class Test {

	public static void main(String[] args){		
	
		
	   ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/CI/configC.xml");
       person p= (person)context.getBean("pers");
       System.out.println(p);
        	
	}

}
