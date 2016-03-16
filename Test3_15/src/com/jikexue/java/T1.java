package com.jikexue.java;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jwawa g1 = new Jwawa(10,15.6f);
		g1.show();
		int c = g1.age;
		System.out.println(c+(double)g1.hight);
		Jwawa.method();
		
	}

}

class Dog{
	public static int age=10;
	private String color;
//	public Dog(){
//		System.out.println("goujianyige1go                                           u lei");
//	}
	public Dog(int a){
		age = a;
	}
    public void show(){
		System.out.println("ÍÁ¹·");
	}
}

class Jwawa extends Dog{
    float hight;
	public Jwawa(int a){
		super(a);
	}
	public Jwawa(int a,float f1){
		this(a);
		hight = f1;
	}
	public void show(float f1){
		super.show();
		System.out.println("¼ªÍÞÍÞ");
	}
	static void method(){
		
	}
}
