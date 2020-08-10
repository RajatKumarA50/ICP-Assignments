// Answer 1
import java.util.*;
public class A5Q1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number :");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		System.out.println(i+"\t"+(int)Math.pow(2, i));
	}
	}

}

// Answer 2
import java.util.Scanner;
public class A5Q2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number of student :");
	int n=sc.nextInt();
	int studentpassed=0;
	System.out.println("Now enter marks of "+n+" students: ");
	for(int i=1;i<=n;i++)
	{
		int marks=sc.nextInt();
		if(marks>=40)
			studentpassed++;
	}
	System.out.println("Number of students passed:"+studentpassed);
	}

}

// Answer 3

public class A5Q3 {

	public static void main(String[] args) {
		int c=0;
		for(int i=100;i<=1000;i++)
		{
			
			
			if(i%5==0 && i%6==0)
			{
				System.out.print(i+" ");
				c++;
			
			if(c%10==0)
				System.out.println();
			}
		}

	}

}

// Answer 4
import java.util.*;
public class A5Q4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter an integer, the input ends if it is 0:");
	int count=0,numberNegative=0,numberPositive=0;
	float sum=0,average;
	for( ; ; )
	{
		int i=sc.nextInt();
		if(i==0)
			break;
		count++;
		sum=sum+i;
		if(i<0)
			numberNegative++;
		else 
			numberPositive++;
	}
	if(count>0)
	{
	System.out.println("The number of positives is :"+numberPositive);
	System.out.println("The number of negative is :"+numberNegative);
	System.out.println("The total is "+sum);
	System.out.println("The Average is "+sum/count);
	}
	else 
	{
		System.out.println("No numbers are entered except 0");
	}
	}

}

// Answer 5
import java.util.Scanner;
public class A5Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int number =sc.nextInt();
			sum=sum+number;
		}
		System.out.println("Sum :"+sum);
		if(0==n)
			System.out.println("average  :0");
		else
		System.out.println("average :"+sum/n);
	}

}

// Answer 6
 import java.util.Scanner;

public class A5Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0;
		System.out.println("Enter value of N and a :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int a=sc.nextInt();
			sum=sum+(1/a);
			
		}
		System.out.println(n/(sum));
	}

}

// Answer 7
import java.util.Scanner;
public class A5Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=-1,sin=-1;
		int sum=0,t=1;
		for(int i=1;i<=n;i++)
		{	sin=sin*(-1);
			r=r*sin;
			sum=sum+i*r;
			t=t+2;
		}
		System.out.println(sum);
		
	}

}

// Answer 8
import java.util.*;
public class A5Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!="+fact);
	}

}

// Answer 9
import java.util.*;
public class A5Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of N:");
		int n=sc.nextInt();
		System.out.println("Enter value of x:");
		double x=sc.nextDouble();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		 double xn= Math.pow(x, n);
		 System.out.println("fact ="+fact +" x^n="+xn);
		System.out.println(xn/fact);
	}

}
