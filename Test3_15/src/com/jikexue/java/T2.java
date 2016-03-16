package com.jikexue.java;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TEST t1 = new TEST();
		base b1 = new base();
		base b2 = new TEST();
//		TEST t2 = new base();		
	}

}
class base{
	public void fun(){}
	
}

class TEST extends base{
	public void fun(){
		
	}
}
