package com.jike.zql.lianxi;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SB s1 = new SB("��������",27,"��ɫ","fat",3800);
		s1.speak();
		s1.heat();
	}

}


 class SB{
	 String name;
	 int age;
	 String haircolor;
	 String wight;
	 double slary;
	 
	 public SB(String n,int a,String c,String w,double s){
		 age = a;
		 haircolor = c;
		 wight = w;
		 slary = s;
		 name = n;
	 }
	 
	 public void speak(){
		 System.out.println(name+":"+"���ڸ�ʲô��������������");
		 System.out.println("���ӵ�����:�����ϼ����������ӣ�ɵ�ƵĲ��У��������쳲��������У���i������ֵ�أ�");
		 System.out.println("����:�������ɣ���");
		 SB_In in = new SB_In();
		 in.feibo();
//		 System.out.println("���ӵ�����:��Ӵ��������,����ʲô");
//		 System.out.println("����:���һ����������");
//		 in.dengyaosanjiao();
	 }
	 
	 public void heat(){
		 System.out.println(name+":"+"���ڸ�ʲô�������������������Ҿʹ����˹�����");
		 System.out.println("���ӵ�����:��Ӵ��������,����������л���ʲô");
		 System.out.println("����:���һ����������");
		 SB_In in = new SB_In();
		 in.dengyaosanjiao();
	 }
	 
	 class SB_In{
		int a;
		int b;
		 
		 public void feibo(){
			 int f1=1;
			 int f2=2;
			 int num;
			 System.out.println("���������֪��쳲��������еĵڼ�����ֵ��");
			 Scanner input = new Scanner(System.in);
			 int a = input.nextInt();
			 
			 if(a==1)
			 {
				 System.out.println("�Ʋ��������е�һ����ֵ�ǣ�"+1);
			 }else if(a == 2){
				 System.out.println("�Ʋ��������е�һ����ֵ�ǣ�"+1);
			 }else{
			     for (int i = 0; i <a-2 ; i++) {
			    	 num = f2;
			    	 f2 = f1+f2;
			    	 f1=num;
			     }
			     System.out.println(f2);
			 }
		 }
		 
		 
		 public void dengyaosanjiao(){
			 System.out.println("��������������εĸ�:");
			 Scanner input = new Scanner(System.in);
			 int a = input.nextInt();
			 for (int i = 0; i < a; i++) {
				 for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				 for (int k = 0; k < a-i; k++) {
					System.out.print(" *");
				}
				 System.out.println();
				
			}
		 }
	 }
	 
	 
 }