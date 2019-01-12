package test;
import java.sql.Date;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;
import service.UserService;

public class MyBatisAndSpringTest {
	
	@Test
	public void testGetAll(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("application-mybatis.xml");
		UserService us = (UserService) ac.getBean("userService");
		
		for(User user:us.getAllUser()){
			System.out.println(user.getId()
					+ "\t" + user.getUserCode()
					+ "\t" + user.getUserName());
		}
	}
	@Test
	public void testaddUsers(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("application-mybatis.xml");
		UserService us = (UserService) ac.getBean("userService");
		User user = new User("y203","��²�","ydc",Integer.valueOf(1),new Date(0).valueOf("1990-1-1"), "15738492837", "��������ݺʹ����������ֶһ�ʱ�䷢");
		us.addUsers(user);
		us.addUsers(user);
//			System.out.println(user.getId()
//					+ "\t" + user.getUserCode()
//					+ "\t" + user.getUserName());
//		}
	}
	
	@Test
	public void testaddsssers(){
	}
}
