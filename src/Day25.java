import java.util.Scanner;


public class Day25 {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 int inputs = scan.nextInt();
		 
		 boolean isPrime = false;
		 
		 if(inputs>0 && inputs<21){
		 
		 for(int i=0; i<inputs; i++){
			 int number = scan.nextInt();
						 
			 if(number==1){
				 System.out.println("Not prime");
				 isPrime = false;
			 }else if(number==2){				
				 isPrime = true;
			 }else{	 
				 int n = (int)Math.sqrt(number);
				//System.out.println();
			 for(int k=2; k<=n;k+=2){				
				if(number%k==0){
					System.out.println("Not prime");					
					isPrime = false;
					break;
				}else{
					isPrime = true;
				}
				if(k==2)k=1;
			 }			 
			 }
			 if(isPrime){
				 System.out.println("Prime"); 
			 }
		 }
		 
		 }
	 }
}
