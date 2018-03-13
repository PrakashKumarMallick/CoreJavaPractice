package filetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordConut {
	public static void countWord() {
		File file = new File("C:/Users/Prakash/Desktop/my.txt");
		try(Scanner sc = new Scanner(new FileInputStream(file))){
			int count=0;
			while(sc.hasNext()){
				sc.next();
				count++;
			}
			System.out.println("Number of words: " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void countWord1() {
		File file = new File("C:/Users/Prakash/Desktop/my.txt");

        FileInputStream fis = null;
        String str = "";

        try {
            fis = new FileInputStream(file);
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
            	System.out.println(content+"\t"+(char)content);
                str += (char) content;
            }

            System.out.println("After reading file");
            System.out.println(str);
            String ch[] = str.split("\\s+");
            System.out.println(ch.length);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	}
	public static void main(String[] args){
		//countWord();
		countWord1();
	}
}
