package com.xinhuaxueyuan.Dog_java;

import java.util.Scanner;

public class Test03 {
//计算两个数的运算a*根号B===>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fn f1 = new Fn();
		f1.set();
		f1.Fun(f1.A);
		f1.Fun(f1.A,f1.B);
	}

}

class Fn{
	float A;
	float B;
	void set()
	{
		System.out.println("input two number:");
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input.nextFloat();
		A = a;
		B = b;
	}
	
	void Fun(float a,float b){
		double c = (float) (a*Math.sqrt(b));
		System.out.println(c);
	}
	void Fun(float a){
		double c = Math.sqrt(a);
		System.out.println(c);
	}
}
