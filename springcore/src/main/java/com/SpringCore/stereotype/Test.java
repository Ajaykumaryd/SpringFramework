package com.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/stereotype/configref.xml");
  Student stu=context.getBean("student",Student.class);
	System.out.println(stu);
	
	
	
	
	}

}
