package com.practice;

public class acb {
	public static void main(String[] args) {
		new acb().even(1,1,0,8); 
	}

	private void even(int a,int b,int size,int max) {
		if(size==max-1){
			return;
		}
		if(size==0){
			System.out.print(a+" "+b);
		}else{
			System.out.print(" ");
			System.out.print(b+" ");
			
		}
		even(b, b+a, size+1, max);
	}
}
