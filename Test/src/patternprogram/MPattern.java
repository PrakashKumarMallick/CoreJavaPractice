package patternprogram;

public class MPattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{			
			for(int j=0;j<10;j++)
			{
				if(j==0||j==i||j==9-i||j==9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
