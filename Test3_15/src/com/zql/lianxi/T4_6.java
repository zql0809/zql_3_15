package com.zql.lianxi;

public class T4_6 {
//����ɼ�    ���캯�������أ����� ע��һ�����  ������������ำֵ��ʱ��  ����ֱ�Ӱ��������¶����һЩ�������̳���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(18);
		Teacher t1 = new Teacher(18,"������",90.5f);
		p1.show();
//		t1.show();
	}

}
class Person{
	protected int age;
	protected  String name;
	public Person(int age){
		System.out.println("��ʼ�����һ����������ˣ���");
		this.age = age;
	}
	public Person(int age,String name){
		this(age);
		this.name = name;
	}
	public void show(){
		System.out.println("��λxx��������:"+name);
		System.out.println(name+"��������:"+age+"��");
		System.out.println();
	}
}

class Teacher extends Person{
	float g;
	public Teacher(int age){
		super(age);
	}
	public Teacher(int age,String name){
		super(age,name);
	}
	public Teacher(int age,String name,float g){
		this(age,name);
		this.g = g;
		System.out.println("���Ź���ڶ��������ˣ�����");
	}
	public void show(){
		System.out.println("��λxx��������:"+name);
		System.out.println(name+"��������:"+age+"��");
		System.out.println(name+"�ɼ���:"+g);
		
	}
	
}

