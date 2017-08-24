package Data_Structure;
import java.io.*;
import java.util.*;
public class HashTable 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		int table[]=new int[11];
		char c;
		String src="/home/bridgeit/gangadhar/Java/algorithm_pgm/file1.txt";	
		LinkedList arr=new LinkedList();
		String temp;
		int intValue[]=new int[50];      
		try
		{
			FileReader fr=new FileReader(src);
			BufferedReader br=new BufferedReader(fr);
			while((temp=br.readLine())!=null)
			{
				String st[] =temp.split(" ");
				for(int i=0;i < st.length;i++)
				{
					intValue[i]=Integer.parseInt(st[i]);
					int num=intValue[i];
					table[num%11]=num;	
				}
			}
			hashTable(table);
			arr.clear();
		}
		finally
		{
		}
		try
		{
			FileWriter fw=new FileWriter(src);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0; i<table.length; i++)
			{
				int n=(table[i]);
				arr.add(i,n);
			}
			System.out.println("\n"+arr);
			String s2=String.valueOf(arr);
			bw.write(s2);
			bw.flush();
		}
		finally
		{
		}
	}
	public static void hashTable(int[] ht)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("file contains");
		for(int i=0; i<11; i++)
		{
			System.out.print(ht[i]+" ");
		}
		System.out.println("\n Enter the search key");
		int key=sc.nextInt();
		if(ht[key%11]==key)
		{
			ht[key%11]=0;
		}
		else
		{
			ht[key%11]=key;
		}
		System.out.println("\n  Hash Table \n");
		for(int i=0; i<11; i++)
		{
			System.out.print(ht[i]+" ");
		}
	}
}