import java.util.*;
import java.lang.*;
import java.io.*;
 class leapyear
 {  
 public static void main(String[] args)
   { 
            int i,n;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the year:");
            n=s.nextInt();
                if(n%4==0)
                {
                   System.out.println("Leap year" +n);
                }
                else 
                {
                   System.out.println("Not a Leap Year" +n);
                }
     }
}  
