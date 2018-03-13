package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceTest {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		LinkedList<String> l=new LinkedList<>();
		for(int i=0;i<1000000;++i){
			a.add("Java"+i);
			l.add("Java"+i);
		}
		
		long start=System.currentTimeMillis();
		for(int j=0;j<500000;++j){
			a.add(j,"core");
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
		long start1=System.currentTimeMillis();
		for(int j=0;j<500000;++j){
			l.add(j,"core");
		}
		long end1=System.currentTimeMillis();
		System.out.println(end1-start1);
	}

}
