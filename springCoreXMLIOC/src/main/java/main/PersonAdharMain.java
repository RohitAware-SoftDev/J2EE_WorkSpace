package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PersonBean;

public class PersonAdharMain {

	
	public static void main(String[] args) {
		
		ApplicationContext context = 
					new ClassPathXmlApplicationContext("PersonAdharConfi.xml");
		PersonBean person = context.getBean(PersonBean.class);
		System.out.println(person);

		((ClassPathXmlApplicationContext)context).close();
	}
}