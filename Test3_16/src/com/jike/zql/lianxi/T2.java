package com.jike.zql.lianxi;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m1 = new Method();
		m1.begin();
		System.out.println("��������Ҫִ�е�����--->1--- * "+"\n"+"2--- + "+"\n"+"3 --- ����"+"\n"
				+"4---- / "+"\n"+"5---- ����"+"\n"+"6----- a��b�η�");
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		switch(c){
		case 1:
			m1.qiuji();
			break;
		case 2:
			m1.qiuhe();
			break;
		case 3:
			m1.jianfa();
			break;
		case 4:
			m1.chufa();
			break;
		case 5:
			m1.sqr();
			break;
		case 6:
			m1.pow();
			break;
		default:
			System.out.println("��δ����������㣡");
			break;
		}
	}

}
interface Father{
	public float pi = 3.1415f;
	void qiuji();
	void qiuhe();
	void jianfa();
	void chufa();
}

interface Mother{
	void sqr();
	void pow();
}

class Method implements Mother,Father{
	double a;
	double b;

	public Method(){
		
	}
	
	public void begin(){
		System.out.println("**********����������������������*****");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
//		System.out.println("��������Ҫִ�е�����--->1--- * "+"\n"+"2--- + "+"\n"+"3 --- ����"+"\n"
//		+"4---- / "+"\n"+"5---- ����"+"\n"+"6----- a��b�η�");
//		c = input.nextInt();
	}
	
   public void qiuji(){
	   System.out.println("��������������ֵĻ���:"+a*b);
   }
   public void qiuhe(){
	   System.out.println("��������������ֵĺ���:"+(a+b));
	   
   }
   public void jianfa(){
	   System.out.println("��������������ֵĲ���:"+ (a-b));
	   
   }
   public void chufa(){
	   
	   System.out.println("��������������ֵ�����:"+a/b);
   }
   public void sqr(){
	   System.out.println("��������������ֵĻ�de������:"+Math.sqrt(a*b));
	   
   }
   public void pow(){
	   System.out.println("�������������a��b�η���:"+Math.pow(a, b));
   }
}