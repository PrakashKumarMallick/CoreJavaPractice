package string;

public class Address {
	private int bld_no;
	private String area;
	private String city;
	private long pincode;
	public Address(int b_no, String ar, String cty, long pin) {
		this.bld_no = b_no;
		this.area = ar;
		this.city = cty;
		this.pincode = pin;
	}
	public int getBld_no() {
		return bld_no;
	}
	public void setBld_no(int bld_no) {
		this.bld_no = bld_no;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	

}
