package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.CustomerBean;

public class CustomerProductMain {
public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("CusProdConfi.xml");
		CustomerBean bean1 = context.getBean("cutomer1",CustomerBean.class);
		System.out.println(bean1);
		
		CustomerBean bean2 = context.getBean("cutomer2",CustomerBean.class);
		System.out.println(bean2);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
