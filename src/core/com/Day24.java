package core.com;
import java.util.LinkedList;
import java.util.Scanner;


public class Day24 {
	
	 public static Node removeDuplicates(Node head) {
	      //Write your code here
		 int element = head.data;
		 int checkNum = 0;
		 System.out.println("Element: "+element);
	
		 Node present = null;
		 Node current=head;
         while(current.next!=null){ 
        	 checkNum = current.data;
        	 System.out.println("checkNum: "+checkNum);
        	present = current.next;
        	
        	while(present.next!=null){
        		if(present.data==checkNum){
        			 System.out.println("Inside checkNum: "+checkNum);
        			 System.out.println("present.data: "+present.data);
        			current.next=present.next;
        			present = current.next;
        			 System.out.println("present.data: "+present.data);
        			 System.out.println("current.data: "+current.data);
        		}else{
        		present = present.next;
        		 System.out.println("#present.data: "+present.data);
    			 System.out.println("#current.data: "+current.data);
        		}
        	}   
        	
        	 System.out.println("**current.data: "+current.data);
        	 System.out.println("**current.next.data: "+current.next.data);
        	 if(current.data==current.next.data && current.next.next==null){
        		current.next=null; 
        	 }
        	 if(current.next!=null){
        		 current=current.next; 
        	 }
        	 
         }
         if(current.next==null && current.data==checkNum){
        	 System.out.println("current.data: "+current.data);
      		System.out.println("hello");
     		current= null;
     		
      	}
         System.out.println("head.data"+head.data);
		 return head;
	    }
	 
	 public static void main(String args[])
     {LinkedList list;
           Scanner sc=new Scanner(System.in);
           Node head=null;
           int T=sc.nextInt();
           while(T-->0){
               int ele=sc.nextInt();
               head=insert(head,ele);
           }
          head=removeDuplicates(head);
           display(head);

    }
	 
	 public static Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
}


class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}