package Data_Structure;

import java.util.Scanner;

public class WeekDaysstoredInQueue
{
	private Node front, rear; 
	private int currentSize; // number of items 

	private class Node//linked list
	{ 
		int data;
		Node next;
	} 
	public WeekDaysstoredInQueue()//constructor
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
		System.out.print(data+" ");
	}
  public static int day(int month, int day, int year)
	   {
	       int y = year - (14 - month) / 12;
	       int x = y + y/4 - y/100 + y/400;
	       int m = month + 12 * ((14 - month) / 12) - 2;
	       int d = (day + x + (31*m)/12) % 7;
	       return d;
	   }
	    public static boolean isLeapYear(int year) 
	    {
	        if((year % 4 == 0) && (year % 100 != 0))
	        {
	        	return true;
	        }
	        if(year % 400 == 0) 
	        {
	        	return true;
	        }
	        else{
	        	return false;
	        }
	    }
	    public static void main(String[] args) 
	    {
	    	Scanner sc=new Scanner(System.in);
	    	WeekDaysstoredInQueue queue=new WeekDaysstoredInQueue();
	    	
	    //  int month = Integer.parseInt(args[0]);    
	    //  int year = Integer.parseInt(args[1]);  
	    	System.out.println("enter the month");
	        int month=sc.nextInt();
	        System.out.println("enter the year");
	        int year=sc.nextInt();
	    	String months[] = {"","January", "February", "March","April", "May", "June",
	            "July", "August", "September","October", "November", "December"};
	        int days[] = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	        if (month == 2 && isLeapYear(year))
	        {
	        	days[month] = 29;
	        }
	        System.out.println("****" + months[month] + " " + year+"****");
	        System.out.println("--------------------");
	        System.out.println(" S  M Tu  W Th  F  S");
	        System.out.println("--------------------");
	        int d = day(month, 1, year);
	        for (int i = 0; i < d; i++)
	        {
	            System.out.print("   ");
	        }
	        for (int i = 1; i <= days[month]; i++) 
	        {
	            //System.out.printf("%2d ", i);
	        	int temp=i;
	        	queue.enqueue(i);
	            if(((i + d) % 7 == 0) || (i == days[month])) 
	            {
	            	System.out.println();
	            }
	        }
	    }
}