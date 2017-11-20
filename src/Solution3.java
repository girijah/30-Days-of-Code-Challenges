import java.util.Scanner;

public class Solution3 {        
  	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] a = new int[N];
    
    	for (int i = 0; i < N; i++) {
    		a[i] = sc.nextInt();
    	}

      	Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
   }
}




class Difference {
  	private int[] elements;
  	public int maximumDifference;

// Add your code here

public Difference(int[] a){
    this.elements=a;
} 

public void computeDifference(){
    int max=-1;
    int min=1000;
    for(int i=0;i<elements.length;i++){
        if(max<elements[i]){
           max=elements[i]; 
        }
        if(min>elements[i]){
         min=elements[i];   
        }
        
        if(maximumDifference<(max-min)){
            maximumDifference=max-min;
        }
    }
    
}

}