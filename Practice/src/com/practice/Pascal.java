package com.practice;

public class Pascal {

	private final int ROW=10;
	private int[][] pascal=new int[ROW-1][];
	private int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pascal().printPascal();
	}
	private void printPascal() {
		// TODO Auto-generated method stub
		pascal[0]=new int[3];
		pascal[0][1]=1;
		for(int i=1;i<ROW-1;i++){
			System.out.println(i);
			pascal[i]=new int[i+3];

			for(int j=0;j<pascal[i].length-2;j++){
				pascal[i][j+1]=pascal[i-1][j+1]+pascal[i-1][j];
				String str=Integer.toString(pascal[i][j]);
				if(str.length()>max)
					max=str.length();
			}
		}
		for(int i=0;i<ROW-1;i++){
			for(int k=0;k<ROW-1/2-i;k++){
				System.out.format("%-" + (max) + "s",  " ");
			}

			for(int j=1;j<pascal[i].length-1;j++){
				System.out.format("%-10s",  pascal[i][j]);
			}
			System.out.println();
		}
	}

}
