package Data_Structure;
import java.util.*;
public class PalindromChecker 
{
	
	    public static void main(String[] args)
	    {
	    	System.out.print("Enter any string to check:");
	        Scanner sc=new Scanner(System.in);
	        String inputString = sc.nextLine();
	        Queue queue = new LinkedList();
	        for (int i = inputString.length()-1; i >=0; i--) 
	        {
	            queue.add(inputString.charAt(i));
	        }
	        String reverseString = "";
	        while (!queue.isEmpty())
	        {
	            reverseString = reverseString+queue.remove();
	        }
	        if (inputString.equals(reverseString))
	        {
	        	System.out.println("The String is a palindrome.");
	        }
	        else
	        {
	            System.out.println("The String is not a palindrome.");
	        }
	        
	    }
	}
