package patternprogram;

public class WPattern {

	public static void main(String[] args) {
		for (int i=0;i<5;i++){
			for(int j=0;j<10;j++){
				if(j==0||j==4-i||j==4+i||j==8){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}System.out.print("\n");
		}

	}

}
