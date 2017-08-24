package Data_Structure;
import java.util.*;
public class AirthmaticExpression
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();
        System.out.println("Parenthesis Matching Test\n");
        System.out.println("Enter expression");
        String exp = sc.next();        
        int len = exp.length();
        System.out.println("\nMatches and Mismatches:\n");
        for (int i = 0; i < len; i++)
        {    
            char ch = exp.charAt(i);
            if (ch == '(')
                stk.push(i);
            else if (ch == ')')
            {
                try
                {
                    int p = stk.pop() + 1;
                    System.out.println("parenthesis matched");
                }
                catch(Exception e)
                {
                	System.out.println("Parenthesis un mached");
                }
            }            
        }
        while (!stk.isEmpty())
        {
        	System.out.println((stk.pop() +1)+" is unmatched");
        }
    }
}