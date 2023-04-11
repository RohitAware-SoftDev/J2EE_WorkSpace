package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Studentbean;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfi.xml");
		Studentbean student = context.getBean(Studentbean.class);
		System.out.println(student);
		
		((ClassPathXmlApplicationContext)context).close(); 
	}
}
