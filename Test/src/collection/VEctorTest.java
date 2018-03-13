package collection;

import java.util.Vector;

public class VEctorTest {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Prakash");
		v.add("Subhash");
		v.add("Deek");
		v.add("Smruti");
		System.out.println(v);
		System.out.println("Adding Tripti at end");
		v.add("Tripti");
		System.out.println(v);
		System.out.println("Add Rajesh at index 2");
		v.add(2, "Rajesh");
		System.out.println(v);
		System.out.println("remove element from 5th index");
		v.remove(5);
		System.out.println(v);
		System.out.println("remove Smruti");
		v.remove("Smruti");
		System.out.println(v);
		/*//remove all the elements from vector list
		v.removeAllElements();
		System.out.println(v);*/
		System.out.println("----------------------------------------------------");
		Vector v1=new Vector();
		v1.add("Smruti");
		v1.add("Rajesh");
		v1.add("Deek");
		//Allow Duplication
		v1.add("Deek");
		System.out.println(v1);
		/*//remove the matching elements of v from v1
		v1.removeAll(v);
		System.out.println(v1);*/
		//It keeps only matching element of v and remove others from v1
		v1.retainAll(v);
		System.out.println(v1);
		
	}

}
