package com.jike.zql.lianxi;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SB s1 = new SB("隔壁胖子",27,"黑色","fat",3800);
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
		 System.out.println(name+":"+"你在干什么，听不听话！！");
		 System.out.println("胖子的老婆:你算老几嘛，你个死胖子，傻逼的不行，有种求出斐波那契数列，第i个的数值呢？");
		 System.out.println("胖子:轻轻松松！！");
		 SB_In in = new SB_In();
		 in.feibo();
//		 System.out.println("胖子的老婆:哎哟，不错嘛,还会什么");
//		 System.out.println("胖子:输出一个等腰三角");
//		 in.dengyaosanjiao();
	 }
	 
	 public void heat(){
		 System.out.println(name+":"+"你在干什么，听不听话！！不听我就打你了哈！！");
		 System.out.println("胖子的老婆:哎哟，打你妈,你除了算数列还会什么");
		 System.out.println("胖子:输出一个等腰三角");
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
			 System.out.println("输入你想得知的斐波那契数列的第几行数值：");
			 Scanner input = new Scanner(System.in);
			 int a = input.nextInt();
			 
			 if(a==1)
			 {
				 System.out.println("菲波那切数列第一个数值是："+1);
			 }else if(a == 2){
				 System.out.println("菲波那切数列第一个数值是："+1);
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
			 System.out.println("请输入等腰三角形的高:");
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