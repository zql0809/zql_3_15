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
		 System.out.println("��ʼ���츸���һ���࣡��");
//		 this.i = i;
	 }
 }
 
 class Subclass extends Superclass{
	 public Subclass(){
		 System.out.println("��ʼ��������ĵ�һ����!!");
	 }
	 public Subclass(int i){
		 System.out.println("��ʼ��������ĵڶ����࣡��");
	 }
 }