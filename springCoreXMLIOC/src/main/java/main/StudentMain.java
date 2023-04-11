package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Studentbean;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfi.xml");
		Studentbean student = context.getBean("student1",Studentbean.class);
		Studentbean student1 = context.getBean("student2",Studentbean.class);
//		since getBean("Name_of_bean", Class name)  we can use it make spring to choose 2nd bean confi for the execution
//		or else since getBean returns the object of Object Class we Can DownCast using Cast Operator
//		Studentbean student = (Studentbean)context.getBean("student2");
		System.out.println(student);
		System.out.println(student1);
		
		((ClassPathXmlApplicationContext)context).close(); 
	}
}
