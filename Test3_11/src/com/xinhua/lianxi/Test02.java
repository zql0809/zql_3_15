package com.xinhua.lianxi;

import java.util.Scanner;

public class Test02 {
//学生成绩
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		double a = input.nextDouble();
		int key = (int) (a/10);
		
		switch (key) {
		case 5:
			System.out.println("不及格");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 7:
			System.out.println("mid");
			break;
		case 8:
			System.out.println("lianghao");
			break;
		case 9:
			System.out.println("youxiu");
			break;
		case 10:
			System.out.println("youxiu");
			break;
		default:
			System.out.println("不及格");
			break;
		}
	}

}
