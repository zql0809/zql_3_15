import java.util.Scanner;


public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int k=7;
		System.out.println("please input the number about the size of the triangle:");
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		for (int j = 0; j < k; j++) {
			for (int j2 = 0; j2 < a; j2++) {
				if(j2>=(a/2)-j && j2<=(a/2)+j)
					System.out.print("*");
				else
					System.out.print(" ");
//				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
