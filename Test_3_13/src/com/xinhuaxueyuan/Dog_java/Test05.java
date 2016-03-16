package com.xinhuaxueyuan.Dog_java;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.set(1);
		a1.area();
		a1.set(2, 1);
		a1.area();
	}
	
}
class A{
	private int a,b;
	void set(int a1, int b1){
		a = a1;
		b = b1;
	}
	void set(int a1)
	{
		a = b= a1;
	}
	
	
	void area()
	{
		float pi = 3.14f;
		float area;
		if(a==b)
		{
			area = pi*a*b;
			System.out.println(area);
		}else if(a != b){
			
			System.out.println(a*b);
		}
	}
}