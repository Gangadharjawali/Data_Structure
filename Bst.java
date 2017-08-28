package Data_Structure;
import java.util.*;
public class Bst 
{
	public int computePossibilities(int n, int solutions[])
	{
		if ((n == 1) || (n == 0)) return 1; 
		int numAllPossibleBSTs = 0;    
		for (int i = 1; i <= n; i++) 
		{
			if (solutions[i-1] == -1)
				solutions[i-1] = computePossibilities(i-1, solutions);                 
			if (solutions[n-i] == -1)
				solutions[n-i] = computePossibilities(n-i, solutions);             
			numAllPossibleBSTs += solutions[i-1]*solutions[n-i];  
		}
		return numAllPossibleBSTs;
	}
	public int numTrees(int n) 
	{
		int solutions[] = new int[n+1];
		for (int i = 0; i <= n; i++)
			solutions[i] = -1;
		return computePossibilities(n, solutions);
	}
	public static void main(String[] args)
	{
		Bst solution = new Bst();   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		System.out.println("Total no of BSTs possible for "+i+" distinct keys: " +solution.numTrees(i));		       
		}
		
	}
}
