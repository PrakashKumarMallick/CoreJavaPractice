package methodprograms;

public class GetSetClient {

	public static void main(String[] args)throws CloneNotSupportedException {
		Car c=new Car("audi","A7",1000);
		GetSet g=new GetSet();
		g.setName("pk");
		GetSet gc=(GetSet)g.clone();
		System.out.println(g.getName());
		gc.setName("subash");
		System.out.println(gc.getC());
		System.out.println(gc.getName());
	}

}
