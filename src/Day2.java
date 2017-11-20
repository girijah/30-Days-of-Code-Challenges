import java.util.Scanner;


public class Day2 {
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	        double tip=tipPercent/100d;
	        double tax=taxPercent/100d;
	        System.out.println("tipPercent: "+tipPercent);
	        System.out.println("taxPercent: "+taxPercent);
	        System.out.println("tip: "+tip);
	        System.out.println("tax: "+tax);
	        
	        // Write your calculation code here.
	        double cost = (mealCost+(mealCost*tip)+(mealCost*tax));
	      
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(cost);
	      
	        // Print your result
	        System.out.println("The total meal cost is "+totalCost+ " dollars.");
	}
}
