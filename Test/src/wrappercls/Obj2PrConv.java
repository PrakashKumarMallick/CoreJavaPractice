package wrappercls;

public class Obj2PrConv {
	
	public static void main(String args[]){
		Integer io=new Integer(100);
		int i=io.intValue();
		i=i+10;
		System.out.println(i);
		Float fo=new Float(12.5f);
		float f=fo.floatValue();
		f=f+1.2f;
		System.out.println(f);
		Byte bo=new Byte((byte)124);
		byte b=bo.byteValue();
		b+=2;
		System.out.println(b);
		Double lo=new Double(12.56);
		byte i1=(byte) lo.intValue();
		System.out.println(i1);
	}
}
