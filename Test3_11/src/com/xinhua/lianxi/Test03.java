package com.xinhua.lianxi;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Byte a = -127;
//		Byte b = -2;
//		Byte c= (byte) (a+b);
//		
//		System.out.println(c);
		
//		输出100以内个位数是6，又能被3整除的数字
		for (int i = 0; i <= 100; i++) {
			if(i%10 == 6 && i%3 == 0)
			{
				System.out.println(i);	
			}else
				continue;
		}
	}

}
