package com.xinhua.lianxi;

import java.util.Scanner;

public class Test02 {
//ѧ���ɼ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		double a = input.nextDouble();
		int key = (int) (a/10);
		
		switch (key) {
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("����");
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
			System.out.println("������");
			break;
		}
	}

}