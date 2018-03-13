package com.inoesis.p1;

public class Rectangle {
	private int len;
	private int wd;
	
	public int area(){
		return this.len*this.wd;
	}	
	public void setLen(int ln){
		if(ln>0){
			this.len=ln;
		}}
	public void setWd(int wid){
		if(wid>0){
			this.wd=wid;
		}}
	public int getLen(){
		return len;
	}
	public int getWd(){
		return wd;
	}
}
