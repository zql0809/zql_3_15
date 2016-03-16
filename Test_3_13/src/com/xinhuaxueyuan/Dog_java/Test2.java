package com.xinhuaxueyuan.Dog_java;

import java.util.Scanner;

public class Test2 {
// 求圆的面积 和 周长
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.area();
		c1.circle();
	}
}

class Circle{
	private float r;
	private float Pi = 3.1415f;
	void area(){
		System.out.println("input zhe r of zhe circle:");
		Scanner input = new Scanner(System.in);
		r = input.nextFloat();
		
		float area;
		area = r*r*Pi;
		
		System.out.println(area);
	}
	void circle(){
		
		float circle = 2*Pi*r;
		System.out.println(circle);
	}
}
