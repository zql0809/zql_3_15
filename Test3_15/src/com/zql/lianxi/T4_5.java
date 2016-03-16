package com.zql.lianxi;

public class T4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tri t1 = new Tri(12.3f,14.5f,16.7f);
		t1.mianJi();
		t1.zhouChang();
		Juxing j1 = new Juxing(12,15);
		j1.mianJi();
		j1.zhouChang();
		Circle c1 = new Circle(5.6f);
		c1.mianJi();
		c1.zhouChang();
	}
}

abstract class Shape{
	abstract void mianJi();
	abstract void zhouChang();
}

class Juxing extends Shape{
	float a;
	float b;
	public Juxing(float a,float b){
		this.a = a;
		this.b = b;
	}
	void mianJi(){
		System.out.println("矩形面积是:"+a*b);
	}
	void zhouChang(){
		 System.out.println("矩形周长是:"+2*(a+b));
	}
}
class Circle extends Shape{
	float r;
    float pi=3.1415f;
    public Circle(float r){
    	this.r = r;
    }
	void mianJi(){
		System.out.println("圆面积是:"+pi*r*r);
	}
	void zhouChang(){
		System.out.println("园周长是:"+2*pi*r);
	}
}
class Tri extends Shape{
	float a;
	float b;
	float c;
	double s;
	
	public Tri(float a,float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void mianJi(){
		s = (a+b+c)*1/2;
		System.out.println("三角形面积是:"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
	void zhouChang(){
		s = a+b+c;
		System.out.println("三角形周长是:"+s);
	}
}