package com.zql.lianxi;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass s1 = new Superclass();
		Subclass s2 = new Subclass();
		Subclass s3 = new Subclass(2);
	}

}
 class Superclass{
//	 int i;
	 public Superclass(){
		 System.out.println("开始构造父类的一个类！！");
//		 this.i = i;
	 }
 }
 
 class Subclass extends Superclass{
	 public Subclass(){
		 System.out.println("开始构造子类的第一个类!!");
	 }
	 public Subclass(int i){
		 System.out.println("开始构造子类的第二个类！！");
	 }
 }