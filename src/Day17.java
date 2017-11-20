import java.util.Scanner;


public class Day17 {
	 public static void main(String []argh)
	    {
	        Scanner in = new Scanner(System.in);
	        int T=in.nextInt();
	        while(T-->0)
	        {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            Calculator1 myCalculator = new Calculator1();
	            try
	            {
	                int ans=myCalculator.power(n,p);	              
	                System.out.println(ans);
	                
	            }
	            catch(Exception e)
	            {
	                System.out.println(e.getMessage());
	            }
	        }

	    }
}


class Calculator1{

	public int power(int n, int p) throws Exception {
		
		 if(n<0 || p<0){
             throw new Exception("n and p should be non-negative");
             }
		return (int)Math.pow(n,p);
	}
	
}