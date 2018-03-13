package exception;

import java.io.*;

class FileOperation{
	private static String path="/home/prabhas/Desktop/Test.txt";
	static void readData()throws FileNotFoundException,IOException{
		File f=new File(path);
		InputStream ist=new FileInputStream(f);
		int length=ist.available();
		for(int i=0;i<length;i++){
			System.out.print((char)ist.read());
		}
		ist.close();
	}
	static void writeData(String data)throws FileNotFoundException,IOException{
		File f=new File(path);
		OutputStream ost=new FileOutputStream(f);
		ost.write(data.getBytes());
		ost.close();
	}
}
public class ReadWriteFile {
	public static void main(String args[]){
		try{
			FileOperation.writeData("Prakash Inoesis");
			FileOperation.readData();
		}catch(FileNotFoundException e){
			System.out.println("file not found");
		}catch(IOException e){
			System.out.println("Read only file");
		}
	}
}