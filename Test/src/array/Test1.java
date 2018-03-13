package array;

import java.util.Arrays;

public class Test1 {
	
	static int getOddOccurrence(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return arr[i];
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int arr[] = {5,1,2,5,4,3,5,2,1,4,3,4,4};		
		System.out.println(getOddOccurrence(arr));
	}

}
