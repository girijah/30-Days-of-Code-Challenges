import java.util.Scanner;


public class Day1 {
	
	public static void main(String[] args) {
		 int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);		
	
     /* Declare second integer, double, and String variables. */
     int secNum;
     double secPoint;
     String str;

     /* Read and save an integer, double, and String to your variables.*/
//     secNum = Integer.parseInt(scan.nextLine());
//     secPoint =  Double.parseDouble(scan.nextLine());    
//     str = scan.nextLine();
     
     secNum = scan.nextInt();
     secPoint = scan.nextDouble(); 
     scan.nextLine();
     str = scan.nextLine();
    

     /* Print the sum of both integer variables on a new line. */
     System.out.println((i+secNum));

     /* Print the sum of the double variables on a new line. */
      System.out.println((d+secPoint));
		
     /* Concatenate and print the String variables on a new line; 
     	the 's' variable above should be printed first. */
      System.out.println(s+str);
	}
}
