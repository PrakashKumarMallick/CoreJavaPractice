
public class LocalFinal {
	final int i=10;//final instance variable
	public static void main(String[] args) {
		final int i=12;//final local variable
		final LocalFinal o=new LocalFinal();//final reference variable
		System.out.println(o.i);
		final int res=o.change(i);//final local variable
		System.out.println(res);
	}
	int change(final int j){//final variable in parameter
		int k=j+1;
		System.out.println(k);
		return k;
	}

}
