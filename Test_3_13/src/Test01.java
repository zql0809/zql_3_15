import java.util.Scanner;


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("��������������εĸߣ�");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        
//        for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i-1; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= row-i+1; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
        for (int i = row; i >= 1; i--) {
        	for (int j = 1; j <= i-1; j++) {
        		System.out.print(" ");
        	}
        	for (int k = 1; k <= row-i+1; k++) {
        		System.out.print(" *");
        	}
        	System.out.println();
        }
        
	}

}