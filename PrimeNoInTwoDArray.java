package Data_Structure;
class PrimeNoInTwoDArray
{
	public static void main(String[] args) 
	{
		int a[][]=new int[10][];
		int initial=1,temp=100;
		int i,j,k;
		System.out.println("prime numbers are");
		for(i=0; i<10; i++)
		{
			int size=0;
			for(j=initial; j<temp; j++)
			{
				boolean flag=true;
				for(k=2; k<j; k++)
				{
					if(j%k==0)
					{
						flag=false;
						break;
					}					
				}
				if(flag==true)
				{
					size++;
				}
			}
			a[i]=new int[size];
			j=0;
			int m;
			for(m=initial; m<temp; m++)
			{
				boolean temp1=true;
				for(int q=2; q<m; q++)
				{
					if(m%q==0)
					{
						temp1=false;
						break;
					}
				}
				
				if(temp1==true)
				{
					a[i][j]=m;
					System.out.print(a[i][j]+"\t");
					j++;
				}
			}
			System.out.println();
			initial=temp;
			temp=temp+100;
		}
	}
}

