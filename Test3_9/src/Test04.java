import java.util.Scanner;


public class Test04 {


	int k=1;
	long total=1;
	
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	
	public void qiuji() {
		// TODO Auto-generated method stub
		
		
		total=k*total;
		k++;
		if(k<=a){
			qiuji();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test04 test=new Test04();
		test.qiuji();
		System.out.println("¼ÆËã½á¹û£º"+test.total);

	}

}
