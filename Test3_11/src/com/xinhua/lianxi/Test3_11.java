package com.xinhua.lianxi;
import java.util.*;

public class Test3_11 {
//	����2

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    
		System.out.println("������һ��������ţ�");
		String c = input.nextLine();
		char c1 = c.charAt(0);
		
		
		System.out.println("�������һ�����֣�");
		int a = input.nextInt();
		System.out.println("������ڶ������֣�");
		int b = input.nextInt();
		int trans = (int)c1;
		
//		System.out.println(trans);
		
		switch (trans) {
		case 43:
			System.out.println("a+b="+(a+b));
			break;
		case 42:
		    System.out.println("a*b="+(a*b));
		    break;
		case 45:
			System.out.println("a-b="+(a-b));
			break;
		case 47:
			System.out.println("a/b="+(a/b));
			break;
		default:
			break;
		}
		
	}

}