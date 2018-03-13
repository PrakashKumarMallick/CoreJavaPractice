package string;

public class Car{
	private String carName;
	private String model;
	private int price;
  public Car(String cnm, String md, int pr)
  {   
	  this.carName=cnm;
	  this.model=md;
	  this.price=pr;
  }
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
  
}
