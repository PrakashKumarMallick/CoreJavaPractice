package methodprograms;

public class Rectangle {
	double length;
	double width;
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Rectangle r1=new Rectangle();
		r.setValue(10,20);
		r1.setValue(20,5);
		double area;
		area=r.area();
		System.out.println(area);
		area=r1.area();
		System.out.println(area);
	}
	double area(){
		return length*width;
	}
	void setValue(double w,double l){
		width=w;
		length=l;
	}
}
