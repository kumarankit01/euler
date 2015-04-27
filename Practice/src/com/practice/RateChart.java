/**
 * 
 */
package com.practice;

/**
 * @author Kumar Ankit
 *
 */
public enum RateChart {
	I(1),V(5),X(10),L(50),C(100),D(500),M(1000);
	private final double value;
	public double getValue() {
		return value;
	}
	RateChart(double value){
		this.value=value;
	}
	public static void main(String[] args) {
		System.out.println(I.value);
	}

}
