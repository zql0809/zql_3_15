package com.jike.zql.lianxi;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retce r1 = new Retce(14.6f,17.6f);
		r1.area();
		r1.perimeter();
		Circle c1 = new Circle(23.3f);
		c1.area();
		c1.perimeter();
		Tri t1 = new Tri(1,1,1);
		t1.area();
		t1.perimeter();
	}

}
interface Shape1{
	final float pi = 3.1415f;
	public void area();
//	public void perimeter();
}

interface Shape extends Shape1{
	public void perimeter();
}

class Retce implements Shape{
	float l;
	float h;
	public Retce(float l,float h){
		this.l = l;
		this.h = h;
	}
	public void area(){
		System.out.println("矩形的面积是:"+l*h);
	}
	public void perimeter(){
		System.out.println("矩形的周长是:"+2*(l+h));
	}
}
class Circle implements Shape{
	float r;

	public Circle(float r){
		this.r = r;
	}
	public void area(){
		System.out.println("矩形的面积是:"+2*r*r*pi);
	}
	public void perimeter(){
		System.out.println("矩形的周长是:"+2*pi*r);
	}
}
class Tri implements Shape{
	float a;
	float b;
	float c;
	double s;
	
	public Tri(float a,float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void area(){
		s = (a+b+c)*1/2;
		System.out.println("三角形面积是:"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
	public void perimeter(){
		s = a+b+c;
		System.out.println("三角形周长是:"+s);
	}
}




