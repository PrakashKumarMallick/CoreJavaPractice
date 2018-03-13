package arrayprograms;

import java.util.Arrays;

class Array{
	private Object arr[];
	private int count=0;
	private int capacity=5;
	public Array(){
		this.arr=new Object[capacity];
	}
	public void add(Object o){
		if(count==capacity){
			this.capacity=2*this.capacity;
			Object temp[]=new Object[capacity];
			for(int i=0;i<arr.length;++i){
				temp[i]=arr[i];
			}
			this.arr=temp;
		}
		this.arr[count]=o;
		++count;
	}
	public void show(){
		System.out.println(Arrays.toString(arr));;
		
	}
	public void insert(Object o,int pos){
		for(int i=arr.length-1;i>pos;i--){
			arr[i]=arr[i-1];
		}
		arr[pos]=o;
	}
	public void delete(int pos){
		for(int i=pos;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
	}
}
public class Test {
	public static void main(String[] args) {
		Array marr=new Array();
		marr.add("Pk");
		marr.show();
		marr.insert("dk", 1);
		marr.show();
		marr.delete(1);
		marr.show();
	}

}
