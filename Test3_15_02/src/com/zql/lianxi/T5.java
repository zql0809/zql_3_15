package com.zql.lianxi;
import java.util.*;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第一个月的兔子的总数是:"+1);
		System.out.println("第二个月的兔子的总数是:"+1);
		
		System.out.println("请输入想得知的某一个月兔子的个数：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		int c = a-2;
	    int f1=1,f2=1,total;
		for (int i = 0; i < c; i++) {
			total = f2;
			f2 = f1+f2;
			f1 = total;
		}
		System.out.println("第"+a+"个月有"+f2+"只兔子");
	}
}