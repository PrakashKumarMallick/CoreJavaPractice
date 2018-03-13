package patternprogram;

public class KPattern{

	public static void main(String[] args) {
		int k=0;
		for(int i=0;i<5;i++){
			int m=(i<=1?k++:k--);
			for(int j=0;j<4;j++){
				if(j==0||j==3-m){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}System.out.print("\n");
		}
	}

}
