package com.zql.lianxi;

public class T4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score stu1 = new Score(75.5f);
		stu1.printScore();
		Score stu2 = new Score(89.5f);
		stu2.printScore();
		
	}

}
class Score{
	private float english;
//利用构造函数赋值
	public Score(float english){ 
		this.english = english;
	}
	public void setScore(float f1){
//	利用成员函数赋值
		english = f1;
	}
	public void printScore(){
		System.out.println("该生的英语成绩是:"+english);
	}
}
