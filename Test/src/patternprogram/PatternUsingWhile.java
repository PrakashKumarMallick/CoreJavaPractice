package patternprogram;

public class PatternUsingWhile {

	public static void main(String[] args) {
		int i=0;
		while(i<3){
			int j=0;
			while(j<3){
				if(j<=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
