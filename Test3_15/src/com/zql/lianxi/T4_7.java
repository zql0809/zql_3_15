package com.zql.lianxi;

public class T4_7 {
	public static void main(String args[]){
		Dog d1 = new Dog(12.5f,2,"black",5,64.27f);
		d1.show();
	}
}
class Dog{
	float weight;
	int age;
	String color;
	int num;
	float total_w;
	public Dog(float w,int age,String c,int n,float t){
		weight = w;
		this.age = age;
		color = c;
		num = n;
		total_w = t;
	}
	void show(){
		System.out.println("狗的体重是:"+weight);
		System.out.println("狗的颜色是:"+age);
		System.out.println("狗的毛色是:"+color);
		System.out.println("狗的条数是:"+num);
		System.out.println("狗的总重量是:"+total_w);
	}
}