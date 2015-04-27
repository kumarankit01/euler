package com.practice;

import java.util.TreeMap;

public class Child extends Parent {
	public static void p(){
		System.out.println("child");
	}
	public static void main(String[] args) {
		Child p = null;
		try {
			p = (Child) Class.forName("com.practice.Child").newInstance();
			int i=70;
			i=i<<1;
			System.out.println(i);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.p();
		System.out.println(p instanceof Parent);

		Integer i=128;
		Integer i2=128;
		//		String s=new String()
		int i1=1444;
		System.out.println(i==i2);

		int a=10;

		a=a++ +a;
		//		a= a++   +  ++a;


		System.out.println(a);
	}
}
