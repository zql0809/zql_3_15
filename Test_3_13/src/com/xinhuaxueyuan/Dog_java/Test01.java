package com.xinhuaxueyuan.Dog_java;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1 = new dog(5,"black",23.5f);
		d1.show();
		d1.speak();
	}

}

abstract class Animal{
	protected int age;
	protected String color;
	protected float weight;
	
	Animal(int a_age,String c_color,float w_weight){
		this.age = a_age;
		this.color = c_color;
		this.weight = w_weight;
	};
	abstract void show();
	abstract void speak();
	
}

class dog extends Animal{
	
	dog(int a_age, String c_color, float w_weight) {
		super(a_age, c_color, w_weight);
		// TODO Auto-generated constructor stub
	}

	void show(){
		System.out.println("this a black dog!");
		System.out.println("he is"+age+"years old");
		System.out.println("he has"+weight+"Kg");
	}

	@Override
    void speak() {
		// TODO Auto-generated method stub		
		System.out.println("if you heat him he well eat you!!!");
	}
}