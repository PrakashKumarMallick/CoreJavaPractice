package patternprogram;

public class APattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<9;j++){
				int m=2;
				if(i==2||j==4-i||j==4+i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.print("\n");
		}
	}

}
