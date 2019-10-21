package work2.com.zut.enity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("boss1")
public class Boss {
	@Value("老板一")
	private String name;
	@Value("老板一有限管理公司")
	private String company;
	@Autowired
	@Qualifier("car1")
	private Car ownCar;
	@Value("篮球")
	private String hobby;
	/*构造方法*/
	public Boss() {
		super();
	}
	/*getter() and setter()*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Car getOwnCar() {
		return ownCar;
	}
	public void setOwnCar(Car ownCar) {
		this.ownCar = ownCar;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Boss [name=" + name + ", company=" + company + ", ownCar=" + ownCar + ", hobby=" + hobby + "]";
	}
	
}

