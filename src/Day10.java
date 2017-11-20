import java.util.Scanner;


public class Day10 {
	 public static void main(String[] args) {
		 int counter=0;
		 int max=0;
		 Scanner sc = new Scanner(System.in);
		 int num=sc.nextInt();
		 String binary = Integer.toBinaryString(num);
		//System.out.println(binary);
		
		for(int i=0; i<binary.length(); i++){
		if(binary.charAt(i)=='1'){
			counter++;	
			//System.out.println("counter: "+counter);
		}else{
			if(max<counter){
			max=counter;	
			}
			counter=0;
		}
		if(i==binary.length()-1){
			if(max<counter){
				max=counter;	
				}	
		}
		}
		
		System.out.println(max);
	 }
}
