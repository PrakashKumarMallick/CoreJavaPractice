package methodprograms;

public class AcesGetSet{
	public static void main(String[] args) {
		GetSet ob=new GetSet();
		ob.setName("Prakash");
		ob.setAge(27);
		ob.setId("@123");
		ob.setPw("pk@123");
		System.out.println("Name-"+ob.getName()+"\nAge-"+ob.getAge()+"\nId-"+ob.getId()+"\nPassword-"+ob.getPw());
	}
}
