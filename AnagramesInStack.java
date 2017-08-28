package Data_Structure;
import java.util.*;
public class AnagramesInStack
{
	Node head;
	class Node
	{
		int data;
		Node link;
		public Node(int d)
		{
			data=d;
			link=null;
		}
		
	}
	public void insert(int val)
	{
		Node n=new Node(val);
		n.link=head;
		head=n;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.link;
		}
	}
	public static void main(String[] args)
	{
		AnagramesInStack stack=new AnagramesInStack();
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=1; i<1000; i++)
		{
			boolean temp=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					temp=false;
					break;
				}
			}
			if(i<11)
			{
				continue;
			}
			if(temp==true)
			{
				count++;
			}
		}
		int arr1[]=new int[count];
		int arr2[]=new int[count];
		int n=0;
		for(int i=1; i<1000; i++)
		{
			boolean temp=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					temp=false;
					break;
				}
			}
			if(temp==true)
			{

				arr1[n]=i;
				if(i<11)
				{
					continue;
				}

				int m=i;
				int sum=0,rem;
				while(m>0)
				{
					rem=m%10;
					sum=(sum*10)+rem;
					m=m/10;
				}
				arr2[n]=sum;
				n++;
			}
		}
		System.out.println("Anagram numbers are are ");
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					int digit=arr1[i];
					stack.insert(digit);
				}
			}
		}
		stack.display();
	}
}