package com.zql.lianxi;

public class T4_6 {
//输出成绩    构造函数的重载！！！ 注意一点就是  当用子类给父类赋值的时候  父类直接把子类重新定义的一些变量给继承了
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(18);
		Teacher t1 = new Teacher(18,"张清林",90.5f);
		p1.show();
//		t1.show();
	}

}
class Person{
	protected int age;
	protected  String name;
	public Person(int age){
		System.out.println("开始构造第一个父类对象了！！");
		this.age = age;
	}
	public Person(int age,String name){
		this(age);
		this.name = name;
	}
	public void show(){
		System.out.println("这位xx的姓名是:"+name);
		System.out.println(name+"的年龄是:"+age+"岁");
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
		System.out.println("接着构造第二个对象了！！！");
	}
	public void show(){
		System.out.println("这位xx的姓名是:"+name);
		System.out.println(name+"的年龄是:"+age+"岁");
		System.out.println(name+"成绩是:"+g);
		
	}
	
}


