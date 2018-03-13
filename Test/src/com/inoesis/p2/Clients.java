package com.inoesis.p2;

import com.inoesis.p1.Rectangle;

public class Clients {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setLen(20);
		r.setWd(30);
		System.out.println(r.area());
		Rectangle r1=new Rectangle();
		r1.setLen(-20);
		r1.setWd(-30);
		System.out.println(r1.area());
	}
}
