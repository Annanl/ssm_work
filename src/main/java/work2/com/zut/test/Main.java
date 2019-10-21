package work2.com.zut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import work2.com.zut.sevice.MeetingServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext actApplicationContext = new ClassPathXmlApplicationContext("work2.xml");
		MeetingServiceImpl meetingService = actApplicationContext.getBean("meetingservice",MeetingServiceImpl.class);
		meetingService.bossMeeting();
	}
}
