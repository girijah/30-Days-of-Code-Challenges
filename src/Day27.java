import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Day27 {
	
	 public static void main(String args[]){
		 ArrayList<Integer> arr = new ArrayList<>();
		
		  Random generator = new Random();
		  int n = generator.nextInt(5)+1;
		  
		  System.out.println(n);
	       
	        if(n<=5){
	        	while(n-->0){	        		
	        		int counter = 0;
		        	int no_of_students = generator.nextInt(200)+1;
		        	//System.out.println("students: "+no_of_students);
		        	
		        	int threshold = generator.nextInt(no_of_students)+1;
		        	//System.out.println("threshold: "+threshold);
		        	int attendance=0;
		        	
		        	for(int i=0; i<no_of_students; i++){
		        		attendance = generator.nextInt(1000+1+1000)-1000;
		        		arr.add(attendance);
		        	}
		        	StringBuilder builder = new StringBuilder();
		        	String str=null;
		        	
		        	for(int i=0; i<no_of_students; i++){
		        		str = arr.get(i)+" ";		        		
		        		builder.append(str);
		        	}
		        	 Scanner scan = new Scanner(builder.toString());
		        	 
		        	while(scan.hasNextInt()){	        	
		        		int prob = scan.nextInt();
		        		//System.out.print(prob+" ");
		        		if(prob<=0){
		        			counter+=1;
		        		}
		        	}
		        	System.out.println();
		        	if(counter>=threshold){
		        		System.out.println("NO");
		        	}else
		        		System.out.println("YES");
		        }	        	
	        }	        
		 }
	}


//	        else if(n>5){
//	        	for(int k=0; k<=5; k++){
//	        		
//        		int counter = 0;
//	        	int no_of_students = scan.nextInt();
//	        	int threshold = scan.nextInt();
//	        	scan.nextLine();
//	        	String line = scan.nextLine();
//	        	
//	        	String[] strArr = line.split(" ");
//	        	if(strArr.length<=200){
//	        		
//	        	for(int i=0; i<strArr.length; i++){
//	        		int presence = 0;
//	        		try{
//	        			presence = Integer.parseInt(strArr[i]);	
//	        		}catch(Exception exc){
//	        			System.out.println(strArr[presence]);
//	        			//System.out.println("String found where number expected!");
//	        		}
//	        		
//	        		if(presence<=0){
//	        			for(int y=0; y<strArr.length; y++){
//	        			System.out.print(strArr[y]+", ");	
//	        			}
//	        			counter+=1;
//	        		}
//	        	}
//	        	
//	        	}
//	        	if(counter>=threshold){
//	        		System.out.println("NO");
//	        	}else
//	        		System.out.println("YES");
//	        }
//	        }
	        
//for(int y=0; y<strArr.length; y++){
//System.out.print(strArr[y]+", ");	
//}
