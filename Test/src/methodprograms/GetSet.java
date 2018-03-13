package methodprograms;
public class GetSet implements Cloneable{
	private String name;
	private int age;
	private String id;
	private String pw;
	Car c;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public String getId() {
		return id;
	}
	public void setId(String newId) {
		this.id = newId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
}
