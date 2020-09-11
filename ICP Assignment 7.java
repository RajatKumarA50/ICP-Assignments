// Answer 1
import java.util.Scanner;
public class A7Q1 
{

	public static void main(String[] args) 
	{
		int t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int arr[]=new int[32];
		int i=0;
		while(n!=0)
		{
			arr[i]=n%8;
			n=n/8;
			i++;
		}
		for(int j=31;j>=0;j--)
		{
			System.out.println(arr[j]+" ");
		}

	}

}

// Answer 2
import java.util.Scanner;
public class A7Q2 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[101];
        System.out.println("Enter numbers between 1 to 100");
       do
       {
    	   n=sc.nextInt();
    	   ar[n]++;
       }
       while(n!=0);
       for(int i=0;i<101;i++)
       {
    	   if(ar[i]==1)
    	   {
    		   System.out.println(i+" occurs "+ar[i]+" time ");
    	   }
    	   else if(ar[i]>1)
    	   {
    		   System.out.println(i+" occur "+ar[i]+" times");
    	   }
       }

	}

}

// Answer 3
import java.util.Scanner;
public class A7Q3 
{

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[10];
		int sno,c=0;
		System.out.println("Enter 10 integers: ");
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to search: ");
		sno=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(ar[i]==sno)
				c++;
		}
		if(c>=1)
		{
			System.out.println("Element "+sno+" is present "+c+" time(s)");
		}
		else
			System.out.println("Element "+sno+" is not present");

	}

}

// Answer 4
import java.util.Scanner;
public class A7Q4 
{

	public static void main(String[] args) 
	{
		double min;
		Scanner sc=new Scanner(System.in);
		double ar[]=new double[10];
		System.out.println("Enter 10 numbers: ");
		for(int i=0;i<10;i++) 
		{
			ar[i]=sc.nextDouble();
			
		}
		min=min(ar);
		System.out.println("Minimum value present in the array is: "+min);
	}
	public static double min(double ar[])
	{
		double minimum=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[0]>ar[i]) 
			{
				minimum=ar[i];
				
			}
		}
		return minimum;
	}
}

// Answer 5
import java.util.Scanner;
public class A7Q5 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
	    n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
				}
			}
		}
		System.out.println("Second largest element in an array is: "+ar[n-2]);
		
	}
}

// Answer 6
import java.util.Scanner;
public class A7Q6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0,j=n-1;i<n/2;i++,j--)
		{
			int t=ar[i];
			ar[i]=ar[j];
			ar[j]=t;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
}

// Answer 7
import java.util.Scanner;
public class A7Q7
{

	public static void main(String[] args) 
	{
		double sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		double ar[]=new double[n];
		for(int i=0;i<n;i++) 
		{
			ar[i]=Math.random();
			sum=sum+ar[i];
			
		}
		avg=sum/n;
		System.out.println("Sum= "+sum);
        System.out.println("Average=" +avg);
	}
}

// Answer 8
import java.util.Scanner;
public class A7Q8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows and columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("Enter numbers: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
       for(int i=0;i<r;i++)
       {
    	   for(int j=0;j<c;j++)
    	   {
    		   System.out.print(mat[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}
