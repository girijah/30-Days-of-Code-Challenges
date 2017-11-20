
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



public class Day18{
	// Write your code here.
	Stack<Character> stack = new Stack<Character>();
	Queue<Character> queue = new LinkedList<Character>();
	
	
	private char dequeueCharacter() {				
		return queue.remove();
		
	}

	private void enqueueCharacter(char c) {		
		queue.add(c);
		
	}

	private char popCharacter() {		
		return stack.pop();
		
	}

	private void pushCharacter(char c) {
		stack.push(c);
		
	}
	
	private void printQueue(){
		Object[] arr = queue.toArray();
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private void printStack(){
		Object[] arr = stack.toArray();
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();
        
        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        
        p.printQueue();
        p.printStack();
        
        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
//        	System.out.println("p.popCharacter(): "+p.popCharacter());
//        	System.out.println("p.dequeueCharacter(): "+p.dequeueCharacter());
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }


}

