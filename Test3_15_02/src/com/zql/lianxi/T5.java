package com.zql.lianxi;
import java.util.*;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��һ���µ����ӵ�������:"+1);
		System.out.println("�ڶ����µ����ӵ�������:"+1);
		
		System.out.println("���������֪��ĳһ�������ӵĸ�����");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		int c = a-2;
	    int f1=1,f2=1,total;
		for (int i = 0; i < c; i++) {
			total = f2;
			f2 = f1+f2;
			f1 = total;
		}
		System.out.println("��"+a+"������"+f2+"ֻ����");
	}
}