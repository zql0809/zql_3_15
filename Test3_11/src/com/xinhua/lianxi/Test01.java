package com.xinhua.lianxi;

import java.util.Scanner;
//�������
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ǵĽ�����");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
//method1		
//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j <=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//method2
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= a; j++) {
				System.out.print("*");
				if(i == j)
					break;
			}
			System.out.println();
		}
	}

}
