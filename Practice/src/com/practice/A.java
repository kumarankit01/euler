package com.practice;

class C{
	{
		System.out.println("C ins");
	}
	C(){
		System.out.println("C const!!");
	}
	static{
		System.out.println("C static");
	}
}
class B extends C{
	{
		System.out.println("B ins");
	}
	static{
		System.out.println("B static");
	}
}
public class A extends B {
	static{
		System.out.println("A static");
	}
	{
		System.out.println("A ins");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();

	}

}
