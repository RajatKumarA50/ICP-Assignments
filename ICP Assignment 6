// Answer 1
import java.util.Scanner;
public class A6Q1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum=addSimple(x,y);
		int sub=subSimple(x,y);
		int pro=proSimple(x,y);
		double div=divSimple(x,y);
		int rem=remSimple(x,y);
		int sqrt=sqrtSimple(x);
		System.out.println("Sum= "+sum);
		System.out.println("Sub= "+sub);
		System.out.println("Pro= "+pro);
		System.out.println("Div= "+div);
		System.out.println("Rem= "+rem);
		System.out.println("Sqr=" +sqrt);
		
	}
	public static int addSimple(int a,int b)
	{
		return (a+b);
	}
	public static int subSimple(int a,int b)
	{
		return (a-b);
	}
	public static int proSimple(int a,int b)
	{
		return (a*b);
	}
	public static double divSimple(double a,double b)
	{
		return (a/b);
	}
	public static int remSimple(int a,int b)
	{
		return(a%b);
	}
    public static int sqrtSimple(int a)
    {
    	return (a*a);
    }
}

// Answer 2
import java.util.Scanner;
public class A6Q2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=1;i<=100;i++)
		{
			int area=pentArea(i);
			System.out.print(area+" ");
			if(i%10==0)
			System.out.println();
		}
	}
      public static int pentArea(int n)
      {
    	  return (n*(3*n-1)/2);
      }
}

// Answer 3
import java.util.Scanner;
public class A6Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int reverse=rev(n);
		boolean result=isPalindrome(n);
		System.out.println("Reverse of the number= "+reverse);
	    System.out.println("Is Palindrome: "+result);
	}
	public static int rev(int n)
	{
		int m=n;
		int t,sum=0;
		while(n!=0)
		{
		t=n%10;
		sum=sum*10+t;
		n=n/10;
		}
		return (sum);
	}
     public static boolean isPalindrome(int n)
     {
    	 int m=n;
    	 boolean result=(rev(n)==m);
    	 return (result);
    	 
     }
}

// Answer 4

public class A6Q4 
{

	public static void main(String[] args) 
	{
		int i,sum=0;
		for(i=2000;i<=2020;i++)
		{
			int noofdays=noOfDays(i);
			sum=sum+noofdays;
		}
	System.out.println("No of days= "+sum);
	}
 public static int noOfDays(int i)
 {
	 if(i%400==0 || i%100!=0 && i%4==0)
		 return (366);
	 else
		 return(365);
 }
}

// Answer 5

public class A6Q5 {

	public static void main(String[] args) 
	{
		int i,c=0;
		for(i=1;i<=10000;i++)
		{
			boolean result= isPrime(i);
			if(result==true)
				c++;
			
		}
		System.out.println(c);
	}
     public static boolean isPrime(int n)
     {   
    	 int c=0;
    	 for(int i=n;i<=10000;i++)
    	 {
    		 if(i%n==0)
    			 c++;
    	 }
    	 boolean test=(c==2);
    		 return (test);
     }
}

// Answer 6

public class A6Q6 {

	public static void main(String[] args) 
	{

		int i,c=0;
		for(i=1;i<=1000;i++)
		{
			int ppn=primepal(i);
			if(ppn>1)
			System.out.print(ppn+" ");
		}
	}
     public static int primepal(int n)
      {
    	 int sum=0;
    	 int temp,m=n,t,c=0;
    	 for(int i=1;i<=n;i++)
    	 {
    		 if(n%i==0)
    			 c++;
    	 
    	 }
    	 if(c==2)
    	 {
    		  sum=0;
    		 temp=n;
    		 while(temp!=0)
    		 {
    			 int r=temp%10;
    			 temp/=10;
    			 sum=sum*10+r;
    			 
    		 }
    	 }
    	if(sum==n)
    		return sum;
    	else
    		return 1;
    	 
         
//         while(n!=0)
//         {
//        	 t=n%10;
//        	 sum=sum*10+t;
//        	 n=n/10;
//         }
//        	 if(sum==m && c==2)
//        	temp=sum;
//			return m;
    }
      }

// Answer 7

public class A6Q7 {

	public static void main(String[] args) 
	{
		
		int i,c=0,n=100,t=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
            c++;
		}
		if(c==2)
		{
			 t=n;
		}
		else
		{
		}		
		for( i=2;i<=1000;i++) 
		{
		
		if(i-t==2)
		System.out.println("("+(i-2)+" , "+i+")");
		}
	}
	}
  
 // Answer 8
 import java.util.Scanner;
public class A6Q8 {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n, s");
		double n=sc.nextDouble();
        double s=sc.nextDouble();
        double area=AreaPoly(n,s);
        System.out.println("Area of polygon="+area);
	}
    public static double AreaPoly(double n,double s)
    {
    	double d=Math.toRadians(180/n);
    	double area;
    	area=(n*s*s)/(4*Math.tan(d));
    	return (area);
    }
}

// Answer 9
import java.util.Scanner;
public class A6Q9 {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerartor and denominator for first fraction");
		int num1=sc.nextInt();
		int dem1=sc.nextInt();
		System.out.println("Enter numerator and denominator for 2 fraction");
		int num2=sc.nextInt();
		int dem2=sc.nextInt();
		FractionSum(num1,dem1,num2,dem2);
	}
	public static void FractionSum(int num1,int dem1,int num2,int dem2)
	{
		
		int num,den,x;
		if(dem1==dem2)
		{
			num=num1+num2;
			den=dem1;
		}
		else 
		{
			num1=num1*dem2;
			num2=num2*dem1;
			num=num1+num2;
			den=dem1*dem2;
		}
		if(num>den)
		{
			x=num;
		}
		else
		{
			x=den;
		}
		System.out.println("("+num+"/"+den+")");
	}

}




