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
		System.out.println("����������:"+weight);
		System.out.println("������ɫ��:"+age);
		System.out.println("����ëɫ��:"+color);
		System.out.println("����������:"+num);
		System.out.println("������������:"+total_w);
	}
}