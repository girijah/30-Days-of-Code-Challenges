import java.io.*;
import java.util.*;


public class Day28 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet();
		
		Scanner scan = new Scanner(System.in);
		int inputs = scan.nextInt();
		scan.nextLine();
		
		while(inputs-->0){
			String firstname = scan.next();
			String email = scan.next();
			if(firstname.matches("[a-z]*")&& firstname.length()<21 && email.contains("@gmail.com") && email.length()<51){
				treeSet.add(firstname+","+email);
			}			
			//scan.nextLine();
		}		
		 
		 for(String c : treeSet){
			 System.out.println(c.split(",")[0]);
		 }
		 
		 Iterator iterator = treeSet.iterator();
		   
		   System.out.println("Tree set data in ascending order: ");     
		   while (iterator.hasNext()){
		   System.out.println(iterator.next() + " ");
		   }
		   
		   
	}
}
