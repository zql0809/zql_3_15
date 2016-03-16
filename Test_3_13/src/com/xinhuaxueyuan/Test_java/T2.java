package com.xinhuaxueyuan.Test_java;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1= new Stu(3,4);
		System.out.println(s1.a);
		s1.show();
	}

}
class people{
	int a ;
	public people(int a1){
		a = a1;
	}
	void show()
	{
		System.out.println(a);
	}
}

class Stu extends people{
	private int b;
	private int b1;
	public Stu(int a2 ,int b1){
		super(a2);
		b = b1;
	}
	
	public Stu(int a1,int a2,int a3){
		this(a1,a2);
		b1 = a3;
	}
	void show(){
		super.show();
		System.out.println("你知道吗你很傻比！！"+b);
	}
}
