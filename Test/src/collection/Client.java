package collection;

import java.util.Vector;
import java.util.Enumeration;

class Product{
	private int pid;
	private String catagory;
	private	int price;
	private String companyName;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
class AmazonWareHouse{
	private static Vector<Product> v=new Vector<Product>();
	static{
		Product p=new Product();
		p.setPid(001);
		p.setCatagory("laptop");
		p.setPrice(25000);
		p.setCompanyName("sony");
		v.add(p);
		Product p1=new Product();
		p1.setPid(002);
		p1.setCatagory("laptop");
		p1.setPrice(27000);
		p1.setCompanyName("dell");
		v.add(p1);
		Product p2=new Product();
		p2.setPid(003);
		p2.setCatagory("Camera");
		p2.setPrice(12000);
		p2.setCompanyName("Sony");
		v.add(p2);
		Product p3=new Product();
		p3.setPid(004);
		p3.setCatagory("Camera");
		p3.setPrice(7500);
		p3.setCompanyName("Nikkon");
		v.add(p3);
		/*Iterator itr=v.iterator();  
        //traverse elements of Vector object  
        while(itr.hasNext()){  
            Product st=(Product)itr.next();  
            System.out.println(st.getPid()+" "+st.getCatagory()+" "+st.getPrice()+" "+st.getCompanyName());*/
		Enumeration<Product> e=v.elements();  
        //traverse elements of Vector object  
        /*while(e.hasMoreElements()){  
            Product st=(Product)e.nextElement();  
            System.out.println(st.getPid()+" "+st.getCatagory()+" "+st.getPrice()+" "+st.getCompanyName());
            //System.out.println(st);
       }*/
		for(;e.hasMoreElements();){
			Product st=(Product)e.nextElement();  
            System.out.println(st.getPid()+" "+st.getCatagory()+" "+st.getPrice()+" "+st.getCompanyName());
		}
        System.out.println("...................................................");
	}
	public static void searchPrByCategory(String ctgry){
		for(int i=0;i<v.size();i++){
			Product p=(Product)v.get(i);
			if(p.getCatagory().equals(ctgry)){
				System.out.println(p.getPid()+" "+p.getCatagory()+" "+p.getPrice()+" "+p.getCompanyName());
			}
		}
	}
	public static void searchPrByCompany(String cmpny){
		for(int i=0;i<v.size();i++){
			Product p=(Product)v.get(i);
			if(p.getCompanyName().equals(cmpny)){
				System.out.println(p.getPid()+" "+p.getCatagory()+" "+p.getPrice()+" "+p.getCompanyName());
			}
		}
	}
	public static void searchPrByCatComp(String ctgry,String cmpny){
		for(int i=0;i<v.size();i++){
			Product p=(Product)v.get(i);
			if(p.getCatagory().equals(ctgry)&&p.getCompanyName().equals(cmpny)){
				System.out.println(p.getPid()+" "+p.getCatagory()+" "+p.getPrice()+" "+p.getCompanyName());
			}
		}
	}
	public static void searchPrByCatComp(String ctgry,String cmpny,int maxpr){
		for(int i=0;i<v.size();i++){
			Product p=(Product)v.get(i);
			if(p.getCatagory().equals(ctgry)&&p.getCompanyName().equals(cmpny)&&p.getPrice()<=maxpr){
				System.out.println(p.getPid()+" "+p.getCatagory()+" "+p.getPrice()+" "+p.getCompanyName());
			}
		}
	}
	public static void searchPrByCatComp(String ctgry,String cmpny,int minpr,int maxpr){
		for(int i=0;i<v.size();i++){
			Product p=(Product)v.get(i);
			if(p.getCatagory().equals(ctgry)&&p.getCompanyName().equals(cmpny)&&p.getPrice()<=maxpr&&p.getPrice()>=minpr){
				System.out.println(p.getPid()+" "+p.getCatagory()+" "+p.getPrice()+" "+p.getCompanyName());
			}
		}
	}
}
public class Client{

	public static void main(String []p){
		System.out.println("Main");
		AmazonWareHouse.searchPrByCategory("laptop");
		AmazonWareHouse.searchPrByCompany("Sony");
		AmazonWareHouse.searchPrByCatComp("laptop", "sony",20000);
		AmazonWareHouse.searchPrByCatComp("Camera", "Sony",5000,13000);
	}
}
