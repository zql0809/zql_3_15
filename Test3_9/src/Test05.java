
public class Test05 {
//   求解方程式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 100; k++)
        {
             for(int j = 0; j<100; j++)
              {
            	 for(int i=0; i<100; i++)
            		 if(k==6*i+3*j&&k==100-i-j&&k/3==100-5*i-3*j)
            			 System.out.println("i="+i+"j="+j+"k="+k);
               }
         }
	}

}
