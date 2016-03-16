package com.zql.jiekou;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retec r1 = new Retec(15.3f,12.6f);
		Tri t1 = new Tri(1.3f,15.6f);
		Circle c1 = new Circle(25.66f);
		r1.area();
		c1.area();
		t1.area();
	}

}
interface Shape{
	public final double pi=3.1415;
	public void area();
}

class Retec implements Shape{
	float a;
	float b;
	public Retec(float a,float b){
		this.a = a;
		this.b = b;
	}
	public void area(){
		double s;
		s = a*b;
		System.out.println("矩形面积是:"+s);
	}
}

class Tri implements Shape{
	float l;
	float h;
	public Tri(float l,float h){
		this.l = l;
		this.h = h;
	}
	public void area(){
		double s;
		s =l*h*1/2;
		System.out.println("三角形面积是:"+s);
	}
}



class Circle implements Shape{
	float r;
	public Circle(float r){
		this.r = r;
	}
	public void area(){
		double s;
		s = pi*r*r;
		System.out.println("圆的面积是:"+s);
	}
}



