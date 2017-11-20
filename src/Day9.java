import java.io.*;
import java.util.*;

public class Day9 {
		
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        int result = factorial(n);
	        System.out.println(result);
	    }
	    
	    public static int factorial(int num){
	    	int total=num;
	    	 System.out.println("n: " + num);
	        if(num>1){       
	        return total * factorial(num-1); 
	        }else
	        return total;
	    }
	
}
