package patternprogram;

public class EPattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(j==0||i==0||i==2||i==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.print("\n");
		}
	}

}
