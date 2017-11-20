

import java.util.Scanner;

public class Day20 {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		  
		  int[] array = new int[num];
		  
		  for(int i=0; i<array.length; i++){
			 array[i]=sc.nextInt(); 
		  }
		  
	int numSwaps=0;
	for(int traversal = 0; traversal< array.length-1; traversal++){           
                for(int comparisonIndex = 0; comparisonIndex< array.length-1; comparisonIndex++){
                                           
                    if(array[comparisonIndex]> array[comparisonIndex+1]){
                       numSwaps++;                                                   
                       
			int temp = array[comparisonIndex];
			array[comparisonIndex] = array[comparisonIndex+1];
			array[comparisonIndex+1] = temp;
                    }                                                
		}
	}
	
	System.out.println("Array is sorted in "+numSwaps+" swaps.");
	if(array.length>0){
		System.out.println("First Element: "+array[0]);
		System.out.println("Last Element: "+array[array.length-1]);
	}

  }
}
