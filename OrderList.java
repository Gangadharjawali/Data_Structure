package Data_Structure;
import java.awt.List;
import java.io.*;
import java.util.*;
public class OrderList
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String src="/home/bridgeit/gangadhar/Java/algorithm_pgm/file1.txt";	
		String temp="";
		String key;
		try
		{
			FileReader fr=new FileReader(src);
			BufferedReader br=new BufferedReader(fr);
			List arr=new List();
			int i,j=-1;
			while((temp=br.readLine())!=null)
			{
				StringTokenizer str=new StringTokenizer(temp," ");
				while(str.hasMoreTokens())
				{
					String token=str.nextToken();					
					arr.add(token);
				}
			}
			System.out.println("File contains");
			for(i=0;i<10;i++)
			{
				System.out.print(arr.getItem(i)+"  ");
			}
			System.out.println(" ");
			System.out.println("Enter the key to search");
			key=sc.next();
			int p;
			for(i=0;i<10;i++)
			{
				p=key.compareTo(arr.getItem(i));
				if(p==0)
				{
					System.out.println("key found at index "+i);
					j=i;
					break;
				}
			}
			if(j==-1)
			{
				System.out.println(key+" is added to the list");
				arr.add(key);
				System.out.println("new list");
				for(i=0;i<11;i++)
				{
					System.out.print(arr.getItem(i)+"  ");					
				}
			}
			else
			{
				System.out.println(key+" is removed from the list");
				arr.remove(j);
				System.out.println("new list");
				for(i=0;i<9;i++)
				{
					System.out.print(arr.getItem(i)+"  ");
				}
			}
		}
		finally
		{
			System.out.println(" ");
		}
	}
}
