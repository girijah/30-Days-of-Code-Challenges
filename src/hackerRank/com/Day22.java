package hackerRank.com;
import java.util.Scanner;

public class Day22 {
	public static int getHeight(Node root){
	    if (root==null) return -1;
	    return Math.max(1+getHeight(root.left),
	    1+getHeight(root.right));
	    }
	/*public static int getHeight(Node node){
		 if (node == null) {
	            return 0;
	        } else {
	             
	             compute the depth of each subtree 
	            int lDepth = getHeight(node.left);
	            int rDepth = getHeight(node.right);
	            if(node.left!=null)
	            System.out.println("node.left: "+node.left.data);
	            if(node.right!=null)
	            System.out.println("node.right: "+node.right.data);
	           
	            
	             use the larger one 
	            if (lDepth > rDepth) {	
	            	System.out.println("^^lDepth: "+lDepth);
		            System.out.println("^^rDepth: "+rDepth);
	                return (lDepth +1);
	            } else {
	            	System.out.println("!!lDepth: "+lDepth);
		            System.out.println("!!rDepth: "+rDepth);
	                return (rDepth+1);
	            }
	        }*/
	   /*   //Write your code here
		int max = 0;
		int counter=0;
		 if(root==null){
	            return 0;
	        }el{/*
	        
	        	if(root.right!=null){
	        		counter=0;	 		
	        		Node rooty = root.right;	        		
	        			
	        		while(rooty!=null){
	        			System.out.println("root.right.data: "+rooty.data);
		        		counter+=1;
		        		rooty = rooty.right;
		        	}
	        		
	        		System.out.println("counter: "+counter);
	        		if(max<counter){
	    	        	max=counter;	
	    	        	} 
	        	}
	        	if(root.left!=null){
	        		Node roote = root.left;
	        		int counterLeft=0;
	        		while(roote!=null){
	        			System.out.println("##root.data: "+roote.data);
	        			counterLeft+=1;
	        			roote = roote.left;
		        	}
	        		
	        		System.out.println("counterLeft: "+counterLeft);
	        		if(max<counterLeft){
	    	        	max=counterLeft;	
	    	        	} 
	        	}
	        		        	
	        }*/
	
	   // }
//	9
//	20
//	50
//	35
//	44
//	9
//	15
//	62
//	11
//	13
	
	 public static Node insert(Node root,int data){
	        if(root==null){
	            return new Node(data);
	        }
	        else{
	            Node cur;
	            if(data<=root.data){
	                cur=insert(root.left,data);
	                root.left=cur;
	            }
	            else{
	                cur=insert(root.right,data);
	                root.right=cur;
	            }
	            return root;
	        }
	    }
		 public static void main(String args[]){
			
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        Node root=null;
	        while(T-->0){
	            int data=sc.nextInt();
	            root=insert(root,data);
	        }
	        int height=getHeight(root);
	        System.out.println(height);
	    }
}

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
