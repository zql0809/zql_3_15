
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 9*9�˷���
		int a=9;
//		for (int i = 1; i <a+1; i++) {
//			for (int j = i; j <a+1; j++) {
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			}
//			System.out.println("\n");
//		}
//		
//		for (int i = 1; i < a+1; i++) {
//			for (int j = 1; j < i+1; j++) {
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			}
//			System.out.println("\n");
//		
		for (int i = 1; i < a+1; i++) {
			for (int j = 1; j < a+1; j++) {
				if( i == j )
				{
					System.out.print(i+"*"+j+"="+i*j+" ");
					System.out.println(" ");break;
				}else
				{
					System.out.print(i+"*"+j+"="+i*j+" ");
				}
			}
		 
		}
	}

}
