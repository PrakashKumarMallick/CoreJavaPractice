package arrayprograms;

public class Test4 {

	public static void main(String[] args) {
		int i[]={1,2,3,2,3,2,4,5};
		int a=0;
		for(int j=0;j<i.length;j++){
			for(int k=j+1;k<i.length;k++){
				if(i[j]==i[k]){
					System.out.println(i[k]);
					break;
				}
			}
		}
	}

}
