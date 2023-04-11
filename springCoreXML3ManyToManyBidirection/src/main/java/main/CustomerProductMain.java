package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerProductMain {
public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("CusProdConfi.xml");
//	 Many TO Many Bidirectional Is not possible it will throw an exception
//	 StackoverFlow So we can't perform
		((ClassPathXmlApplicationContext)context).close();
	}
}
