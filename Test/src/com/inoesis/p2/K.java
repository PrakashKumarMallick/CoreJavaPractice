package com.inoesis.p2;

public class K {

	public static void main(String[] args) {
		System.out.println("m2 of z is called");
		Y.m2();//m2 of y is called
		com.inoesis.p1.X.m1();//m1 of x is called
		com.inoesis.p2.X.m2();//m2 of x is called
	}

}
