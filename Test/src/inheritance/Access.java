package inheritance;
class Aa {
	int i; 
	int j; 
	void setij(int x, int y) {
	i = x;
	j = y;
	}
	public static void main(String args[]){
		Aa supercls=new Aa();
		supercls.setij(12,13);
	}
}
class Bb extends Aa {
	int total;
	public void sum() {
		total = i + j; 
	}
}
public class Access {
	public static void main(String args[]) {
		Bb subOb = new Bb();
		subOb.setij(10, 12);
		subOb.sum();
		System.out.print("Total is " + subOb.total);
	}
}