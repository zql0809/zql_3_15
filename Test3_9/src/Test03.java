import java.util.Scanner;


public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ÇëÊäÈëÊıÖµ£º");
		Scanner input = new Scanner(System.in);
		int i=input.nextInt();
//		if(i/10)
		System.out.println(Test03.digui(i));
		input.close();
	}
		
		public static long digui(int a){
			if(a<=1)
				return 1;
			else
				return digui(a-1)*a;
		}
	
}
