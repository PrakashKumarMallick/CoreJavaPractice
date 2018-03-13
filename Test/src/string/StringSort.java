package string;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String s="prakash",s1="mallick";
		int l=s.length(),l1=s.length();
		byte b[]=s.toLowerCase().getBytes();
		byte b1[]=s1.toLowerCase().getBytes();
		byte b2[]=new byte[s.length()+s1.length()];
		for(int i=0,j=b.length-1;i<b2.length;i++,j++){
			if(b.length<b2.length)
				b2[i]=b[i];
			else{
				b2[j]=b1[i];
			}			
		}
		for(int i=0;i<b2.length;i++){
			System.out.print(b2[i]);
		}
//		Arrays.sort(b);
//		System.out.println();
//		for(int i=0;i<len;i++){
//			System.out.print((char)b[i]);
//		}
	}

}
