package Data_Structure;
import java.util.*;
public class AnagramesInQueue
{
	private Node front, rear; 
	private int currentSize; // number of items 

	private class Node//linked list
	{ 
		int data;
		Node next;
	} 
	public AnagramesInQueue()//constructor
	{
		front = null;
		rear = null;
		currentSize = 0;
	}
	public boolean isEmpty()
	{
		return (currentSize == 0);
	}
	public void enqueue(int data)
	{
		Node oldRear = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;
		if (isEmpty()) 
		{
			front = rear;
		}
		else 
		{
			oldRear.next = rear;
		}
		currentSize++;
		System.out.println(data+ " added to the queue");
	}
public static void main(String a[])
{ 
	AnagramesInQueue queue=new AnagramesInQueue();
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
				queue.enqueue(digit);
			}
		}
	}
 }
}