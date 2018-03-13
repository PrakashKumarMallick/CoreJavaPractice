package patternprogram;

public class HPattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(j==0||i==2||j==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.print("\n");
		}
	}

}
