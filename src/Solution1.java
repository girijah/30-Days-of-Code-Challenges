import java.io.*;
import java.util.*;

public class Solution1{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String rectangle = scan.nextLine();
		String[] divider = rectangle.split(" ");
		
		int row = Integer.parseInt(divider[0]);
		int column = Integer.parseInt(divider[1]);
		
		int[][] matrix = new int[row][column];
		
		for(int i=0;i<row;i++){
		String line = scan.nextLine();	
		for(int j=0;j<column;j++){
		if(line.charAt(j)=='.'){
		matrix[i][j]=1;	
		}else if(line.charAt(j)=='x'){
		matrix[i][j]=0;	
		}
		}
		}
//		for(int i=0; i<matrix.length;i++){
//			for(int j=0;j<matrix[0].length;j++){
//				System.out.print(matrix[i][j]+" ");	
//			}
//			System.out.println();
//		}
		
		int i=0;
		boolean possible=false;
			for(int j=0;j<matrix[0].length;j++){
				
				if(matrix[i][j]==0){
					possible=false;
				}else{
					possible=true;
				}
				
			}
			if(possible==true){
			int j=matrix[0].length-1;
			for(int k=0; k<matrix.length;k++){
				if(matrix[k][j]==0){
					possible=false;
				}else{
					possible=true;
				}
			}
			}
			if(possible==true){
			int u=0;
			for(int v=0;v<matrix.length;v++){
				if(matrix[v][u]==0){
					possible=false;
				}else{
					possible=true;
				}
			}
			}
			if(possible==true){
			int s=matrix.length-1;
			for(int t=0;t<matrix[0].length;t++){
				if(matrix[s][t]==0){
					possible=false;
				}else{
					possible=true;
				}
			}
			}
			if(possible==true){
				System.out.println("perimeter: "+(2*(row-1)+2*(column-1)));
			}else{
				System.out.println("impossible");
			}
			
			System.out.println();		
		

	}

}
