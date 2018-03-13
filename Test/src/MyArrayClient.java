class MyArray{
	private Object data[];
	private int capacity=10;
	private int count=0;
	public MyArray(int size){
		this.capacity=size;
		this.data=new Object[capacity];
	}
	public MyArray(){
		this.data=new Object[capacity];
	}
	public int getCapacity(){
		return this.capacity;
	}
	public int getSize(){
		return count;
	}
	public void add(Object o){
		if(count==capacity){
			this.capacity=2*this.capacity;
			Object temp[]=new Object[capacity];
			for(int i=0;i<data.length;++i){
				temp[i]=data[i];
			}
			this.data=temp;
		}
		this.data[count]=o;
		++count;
	}
	public Object get(int pos){
		return this.data[pos];
	}
	public String toString(Object[] data){
		StringBuffer b=new StringBuffer();
		b.append('[');
		for(int i=0;;i++){
			b.append(String.valueOf(data[i]));
			if(i==data.length-1){
				return b.append(']').toString();
			}
			b.append(",");
		}
	}
	public String show(){
		return toString(data);
		
	}
	public void insert(Object obj,int pos){
		for(int i=data.length-1;i>pos;i--){
	        data[i] = data[i-1];
	    }
	    data[pos] = obj;
	}
    public void delete(int pos){
		for(int i=pos;i<data.length-1;i++)
	         data[i] = data[i+1];	
		}
}
public class MyArrayClient {

	public static void main(String[] args) {
		MyArray marr=new MyArray(5);
		MyArray marr1=new MyArray();
		System.out.println("Capacity of marr: "+marr.getCapacity());
		System.out.println("Size of marr: "+marr.getSize());
		System.out.println("Capacity of marr: "+marr1.getCapacity());
		System.out.println("Size of marr: "+marr1.getSize());
		marr.add("Prakash");
		marr.add("Deek");
		marr.add("Subhash");
		marr.add("Tripti");
		marr.add("Smruti");
		System.out.println("Capacity of marr: "+marr.getCapacity());
		System.out.println("Size of marr: "+marr.getSize());
		marr.add("patil");
		System.out.println("Capacity of marr: "+marr.getCapacity());
		System.out.println("Size of marr: "+marr.getSize());
		System.out.println(marr.get(1));
		System.out.println(marr.show());
		marr.insert("Rajesh", 2);
		System.out.println(marr.show());
		marr.delete(4);
		System.out.println(marr.show());
	}

}
