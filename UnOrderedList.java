package Data_Structure;

import java.awt.List;
import java.io.*;
import java.util.*;
public class UnOrderedList 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		String src="/home/bridgeit/gangadhar/Java/algorithm_pgm/file.txt";       
		List arraylist=new List();  
		String word;
		try
		{
    	   FileReader fr=new FileReader(src);
    	   BufferedReader br=new BufferedReader(fr);
    	   String temp="";
    	   while((temp=br.readLine())!=null)
    	   {
    		   System.out.println(temp);
    		   StringTokenizer str=new StringTokenizer(temp,",");
    		   while(str.hasMoreTokens())
    		   {
    			   String token=str.nextToken();
    			   arraylist.add(token);
    		   }
    	   }
		}
		finally
		{
		}
		System.out.println("enter the word tobe search");
		word=sc.nextLine();
		int i,j,p=-1;
		for(i=0; i<5; i++)
		{
    	   j=word.compareTo(arraylist.getItem(i));
    	   if(j==0)
    	   {
    		   p=i;
    		   break;
    	   }
       }
       if(p==-1)
       {
    	   System.out.println("\n word not found ");
    	   arraylist.add(word);
    	   System.out.println("new list is ");
    	   for(i=0; i<6; i++)
    	   {
    		   System.out.print(arraylist.getItem(i)+" ");
    	   }
       }
       else
       {
    	   System.out.println("\n word found at "+p);
    	   arraylist.remove(p);
    	   System.out.println("new list is ");
    	   for(i=0; i<4; i++)
    	   {
    		   System.out.print(arraylist.getItem(i)+" ");
    	   }
       }
	}
}