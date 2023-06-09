package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.TeamBean;

public class TeamPlayerMain { 
	public static void main(String[] args) {
		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("TeamPlayerConf.xml");
		TeamBean bean = context.getBean(TeamBean.class);
		
		System.out.println(bean);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
