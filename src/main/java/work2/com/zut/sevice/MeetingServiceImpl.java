package work2.com.zut.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work2.com.zut.enity.Meeting;

@Service("meetingservice")
public class MeetingServiceImpl implements MeetingService{
	
	@Autowired
	private Meeting meeting;
	
	public void bossMeeting() {
		System.out.println("-----------会议 的主题 "+meeting.getItem()+"---------------");
		System.out.println("参加人员 ："+meeting.getBossList().get(0).toString());
		System.out.println("参加人员 ："+meeting.getBossList().get(1).toString());
	}

}
