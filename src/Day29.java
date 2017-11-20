import java.util.Scanner;


public class Day29 {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  
		  int T = scan.nextInt();
		
		  
		  while(T-->0){
			int N = scan.nextInt();
			int K = scan.nextInt();
			//System.out.println("N: "+N);
			//System.out.println("K: "+K);
			int[] arr = new int[N];
			for(int i =1; i<=N; i++){
				arr[i-1]=i;
			}
			int max = 0;
			for(int y=0; y<arr.length; y++){
				for(int k=y+1; k<arr.length; k++ ){
					int A=arr[y];
					int B=arr[k];
					//System.out.print("A: "+A+" B: "+B);
					//System.out.println();
					int tmp = A & B;
					if(tmp < K && max < tmp){
					max = tmp;	
					}
					//System.out.println("tmp: "+tmp);
				}
			}
			System.out.println(max);
		  }
	  }

}
