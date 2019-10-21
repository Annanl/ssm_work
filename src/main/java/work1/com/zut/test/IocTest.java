package work1.com.zut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import work1.com.zut.ioc.UserService;
import work1.com.zut.ioc.UserServiceImpl;

public class IocTest {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("ioc.xml");
		UserService userService = act.getBean("userService", UserServiceImpl.class);
		userService.say();
	}
}
