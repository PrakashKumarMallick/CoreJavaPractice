package string;

public class MarkerClient {
	public static void main(String[] args) throws CloneNotSupportedException{
		Marker m=new Marker();
		m.setName("Reynolds");
		m.setPrice(30);
		
		Marker m1=(Marker)m.clone();
		}
}
