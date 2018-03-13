package collection;
import java.util.Iterator;
import java.util.TreeSet;

public class UserdefinedObjectTreeset {
	
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		Leader l=new Leader("modi","banaras",62,"bjp","india");
		Leader l1=new Leader("nitesh","bihar",67,"jdu","india");
		Leader l2=new Leader("naveen","ganjam",60,"bjd","india");
		Leader l3=new Leader("naveen","ganjam",65,"bjd","india");
		ts.add(l);
		ts.add(l1);
		ts.add(l2);
		ts.add(l3);
		Iterator it=ts.iterator();
		while(it.hasNext()){
			Leader ld=(Leader)it.next();
			System.out.println(ld.name+" "+ld.cName+" "+ld.PartyName);
		}
	}

}
