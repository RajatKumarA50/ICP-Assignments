import java.util.Scanner;
public class EncryptByPin 
{
   public static void main(String[] args) 
   { 
	 int t1,t2,t3,t4,pin=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter length of pin you want to generate "); 
	 int length=sc.nextInt(); //Inputs the length of the PIN to be generated
	 System.out.println("Now enter four numbers of "+length+" digits: ");
	 int val1=sc.nextInt();  // Input four numbers of above length 
	 int val2=sc.nextInt();
	 int val3=sc.nextInt();
	 int val4=sc.nextInt();
	 sc.nextLine();
	 System.out.println("Enter the Message you want to Encrypt: ");
	 String msg=sc.nextLine(); //Inputs the Message which is to be Encrypted
	 sc.close();
	 while(val1!=0 && val2!=0 && val3!=0 && val4!=0)
	 {
		 t1=val1%10;     // Extract the last digit of Entered numbers
		 t2=val2%10;
         t3=val3%10;
         t4=val4%10;
         int min=Math.min(t1, Math.min(t2, Math.min(t3, t4))); //Finds minimum value of the extracted digits
         pin=pin*10+min; // Stores the pin
         val1=val1/10;
         val2=val2/10;
         val3=val3/10;
         val4=val4/10;
         } String s=" ",s1=" ";
	       s=s+pin;   // Stores the pin in a string variable
	       for(int k=length;k>=0;k--)
	       {
	    	   s1=s1+s.charAt(k); //Reversed the above String
	       }
	   System.out.println("PIN: "+s1); //Prints the PIN
      msg=msg.replaceAll(" ",""); //Removes all the blank spaces from the Entered message
      msg=msg.toLowerCase(); // Converts the message to Lower Case
      String newmsg=" ";
      int h,t; char ch; String finalmsg=" ";
      int a=pin;
      int msgchar;
      for(int i=0;i<msg.length();i++)
      {
    	  t=(int)msg.charAt(i); 
    	  msgchar=t+pin%10; //Converts the message to ASCII values
    	  if(msgchar>122)
    	  {
    		  msgchar=96+msgchar%122;  //
    		  ch=(char)(msgchar);  //Converts the ASCII values to Characters  
    	  }
    	  else
    	  {
    		  ch=(char)(msgchar);
    	  }
    	  finalmsg=finalmsg+ch;
    	  pin=pin/10;
    	  if(pin==0)
    	  {
    		  pin=a;
    	  }
    	  else
    	  { }
      } 
      // Prints the Encrypted Message
      System.out.println("Encrypted Message is: "+finalmsg.toUpperCase());
   }                                           // Name:    Rajat Kumar
                                               // Regd no: 1941012255
 }
   


