package exam;
public class Test10 {
	public static void main(String args[]) {
		/*
		  for(int i = 0; i < 3; i++) {
			for(int j = 3; j >= 0; j--) {
			   if(i == j) continue;
			   System.out.println(i + " " + j);
			}
		   }*/
		int i=1;
		while(i<100){
			if(i%2==0){
				continue;
			}
			System.out.println(2*i);
			++i;
		}
		}
	}
	