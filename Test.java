package com.example;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//  ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//  
//		Employee e=(Employee)factory.getBean("obj");
//		
//		System.out.println(e.getId());
//		System.out.println(e.getName());
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Employee s=(Employee)factory.getBean("e");
		s.show();
		
	}



	

}

