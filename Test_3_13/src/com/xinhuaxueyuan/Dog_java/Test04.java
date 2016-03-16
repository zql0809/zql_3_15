package com.xinhuaxueyuan.Dog_java;

import java.util.Scanner;

public class Test04 {
	static float a;
	static int b;
	void set(){
		System.out.println("输入两个数求其运算结果");
		Scanner input = new Scanner(System.in);
		a = input.nextFloat(); 
		b = input.nextInt(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test04 t2 = new Test04();
		t2.set();
		
		TEST t1 = new TEST();
		System.out.println(t1.num(a));
		System.out.println(t1.num(b));

	}
}

class TEST{
	float num(float a){
		a-=1;
		return a;
	}
	float num(int b){
		b-=2;
		return b;
	}
}

