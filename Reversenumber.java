import java.util.*;
import java.lang.*;
import java.io.*;
class Reversenumber
{
   public static void main(String[] args)
     {
         int a,b=0;
         System.out.println("Enter the number to reverse:");
         Scanner in =new Scanner(System.in);
         a=in.nextInt();
 
         while(a!=0)
           {
                b=b*10;
                b=b+a%10;
                a=a/10;
            }
             System.out.println("Reverse of given number is:" +b);
      }
}
        
