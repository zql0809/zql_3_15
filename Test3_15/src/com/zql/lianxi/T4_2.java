package com.zql.lianxi;

import java.util.Scanner;
//���������
public class T4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ�������������:");
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		Counter t1 = new Counter(a);
		Scanner input2 = new Scanner(System.in);
		System.out.println("������������������:");
		String str = input2.nextLine();
		char b = str.charAt(0);
		
		if(b =='+'){
			t1.increment();
			t1.show();
		}else if(b == '-')
		{
			t1.decrement();
			t1.show();
		}
	}

}

class Counter{
	float vaule;
	public Counter(float f1){
		this.vaule = f1;
	}
	public void increment(){
		vaule = ++vaule;
	}
	public void decrement(){
		vaule = --vaule;
	}
	public float getValue(){
		return vaule;
	}
	public void show(){
		System.out.println("�������ǣ�"+vaule);
	}
	
}