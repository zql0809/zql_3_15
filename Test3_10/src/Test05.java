import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		double data1=input.nextDouble();
		double data2=input.nextDouble();
	
//		Scanner input2 = new Scanner(System.in);
		String op=input.nextLine();
		
		
		if(op == "+")
			System.out.println("data1"+"+"+"data2"+(data1+data2));
		else if( op == "*")
			System.out.println("data1"+"*"+"data2"+data1*data2);
		else if(op == "-")
			System.out.println("data1"+"-"+"data2"+(data1-data2));
		else if( op == "/")
			System.out.println("data1"+"/"+"data2"+(data1/data2));
    
	}

}