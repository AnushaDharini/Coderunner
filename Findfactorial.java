import  java.util.*;
import  java.lang.*;
import  java.io.*;
class Findfactorial 
{
 public static void main(String []args)
    {
       int n,c,fact=1;
       System.out.println("Enter an integer to find the factorial:");
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       for(c=1;c<=n;c++)
          fact=fact*c;
          System.out.println("Factorial of"+n+" is = "+fact);
   }
}
