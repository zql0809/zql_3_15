package com.zql.lianxi;

import java.util.Scanner;

public class T4_3 {
//求立方体体积
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入立方体三边");
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		float z = input.nextFloat();
		
		if(x == y && y == z){
		Box b1 = new Box(x);
		b1.jiSuan();
		b1.show();
		}else if(x == y && y != z)
		{
			Box b2 = new Box(x,z);
			b2.jiSuan();
			b2.show();
		}else if(x != y && y != z){
			Box b3 = new Box(x,y,z);
			b3.jiSuan();
			b3.show();
		}
			
	}

}

class Box{
	float total;
	float a;
	float b;
	float c;
	public Box(float a){
		this.a = a;
		this.b = a;
		this.c = a;
	}
	public Box(float a,float b){
		this(a);
		this.c = b;
	}
	public Box(float a,float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void jiSuan(){
		total = a*b*c;
	}
	public void show(){
		System.out.println("正方体体积是:"+total);
	}
}
