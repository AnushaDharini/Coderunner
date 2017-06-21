import java.util.*;
import java.lang.*;
import java.io.*;
 class largenumber
 {  
 public static void main(String[] args)
{ 
             int a,b,c;
             Scanner s = new Scanner(System.in);
            System.out.println("Enter the a ,b,c numbers:");
            
            a= s.nextInt();
            b= s.nextInt();
            c= s.nextInt();
                if (a>b&&a>c)
              {
                System.out.println("a is large number:" +a);
              }
                else if (b>c)
               {           
                 System.out.println("b is large number:" +b);
                }
            else
               {
                  System.out.println("c is large number:" +c);
               }
}
}
