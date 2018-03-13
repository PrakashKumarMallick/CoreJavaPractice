package string;

public class PersonClient {
	public static void main(String[] args)throws CloneNotSupportedException

	{
       Car c=new Car("Maruti","800",2000);
       Address a=new Address(60,"Mkere","Blore",560054);
       Person p1=new Person("DEEK",22,1234567890,c,a);
       Person p2=new Person("TRIP",21,1111111122,new Car("Alto","K10",3000) ,a);
       System.out.println(p1.getName());
       
       p1.displayDetails();
      
       p2.displayDetails();
       
       Person pc=(Person)p1.clone();
       /*
       clone() is protected method so will b visible only in 
       
       sub classes
       */
       //now modify clone- change car name to BMW
      pc.getC().setCarName("BMW");
       pc.displayDetails();
       p1.displayDetails();
	}

}
