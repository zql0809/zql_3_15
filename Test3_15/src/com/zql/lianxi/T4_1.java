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
//���ù��캯����ֵ
	public Score(float english){ 
		this.english = english;
	}
	public void setScore(float f1){
//	���ó�Ա������ֵ
		english = f1;
	}
	public void printScore(){
		System.out.println("������Ӣ��ɼ���:"+english);
	}
}
