package work2.com.zut.enity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component(value = "car1")
public class Car {
	@Value("宝马")
	private String brand;
	@Value("黑色")
	private String color;
	@Value("1.5t")
	private String displacement;
	/*构造方法*/
	public Car() {
		super();
	}
	/*getter() and setter()*/
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", displacement=" + displacement + "]";
	}
	
}
