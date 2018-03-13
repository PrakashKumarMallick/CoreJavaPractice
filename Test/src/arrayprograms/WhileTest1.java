package arrayprograms;

public class WhileTest1 {

	public static void main(String[] args) {
		int i=1,j=1;
		while(j<=2){
			if(i%3==0&&i%5==0){
				System.out.println(i);
				j++;
			}
			i++;
		}

	}
}
