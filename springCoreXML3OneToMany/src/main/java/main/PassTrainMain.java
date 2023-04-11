package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.PassengerBean;

public class PassTrainMain {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("PasstrainConfi.xml");
		PassengerBean bean1 = context.getBean("passenger1",PassengerBean.class);
		System.out.println(bean1);
//		Using Type cast Operator
		PassengerBean bean2 = (PassengerBean)context.getBean("passenger2");
		System.out.println(bean2);
		((ClassPathXmlApplicationContext)context).close();
	}
}	
 