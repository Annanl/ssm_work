package work2.com.zut.enity;

import java.util.List;

public class Meeting {
	
	private String item;
	private List<Boss> bossList;
	
	/*构造方法*/
	public Meeting() {
		super();
	}
	/*getter() and setter()*/
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public List<Boss> getBossList() {
		return bossList;
	}
	public void setBossList(List<Boss> bossList) {
		this.bossList = bossList;
	} 
}
