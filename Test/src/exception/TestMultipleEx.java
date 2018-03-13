package exception;

public class TestMultipleEx {

	public static void main(String[] a) {
		try{
			int n[]=new int[a.length];
			for(int i=0;i<a.length;i++){
				n[i]=Integer.parseInt(a[i]);
			}
			int sum=0;
			double avg=0;
			for(int i=0;i<n.length;i++){
				sum=sum+n[i];
			}
			avg=sum/n.length;
			System.out.println(avg);
		}
		catch(ArithmeticException e){
			System.out.println("Must give some value");
		}
		catch(NumberFormatException e){
			System.out.println("Write Valid no");
		}
		catch(Exception e){
			System.out.println("Something wrong");
		}
	}
}
