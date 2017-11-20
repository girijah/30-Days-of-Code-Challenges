import java.util.Scanner;


public class Day16 {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int num=0;
        try{
        	num = Integer.parseInt(str);
        	 System.out.println(num);
        }catch(Exception exc){
        	System.out.println("Bad String");
        }
        
       
    }
}
