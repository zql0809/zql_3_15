import java.util.Scanner;


public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		double a=input.nextInt();
		double total=0;
		if(a<=0)
			total=0;
		else if(0<a && a<=10)
			total=a;
		else if(a>10 && a<=20)
			total=a*a-1;
		else if(a>20 && a<40)
			total=5*a+20;
		System.out.println(total);
	}

}
