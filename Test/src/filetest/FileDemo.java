package filetest;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File myfile=new File("C:\\Users\\Prakash\\Desktop/my.txt");
		System.out.println(myfile.getName());
		System.out.println(myfile.getPath());
	}

}
