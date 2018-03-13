class Text1{
	int i,j;
	Text1(int i,int j){
		this.i=i;
		this.j=j;
	}
}
public class Mytest extends Text1{
	int k;
	Mytest(int i,int j,int k){
		super(i,j);
		this.k=k;
	}
	public static void main(String[] args) {
		Text1 t=new Text1(4,5);
		Mytest mt=new Mytest(4,5,6);
		System.out.println(t.i+t.j);
		System.out.println(mt.i+mt.j+mt.k);
	}

}
