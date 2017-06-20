import java.util.*;
import java.lang.*;
import java.io.*;
 class numbercheck
 {  
 public static void main(String[] args)
{ 
             int a;
             Scanner s = new Scanner(System.in);
            System.out.println("Enter the number:");
            a= s.nextInt();
       if (a>0)
              { 
                    System.out.println("Given Number is Positive");
              }
     else if (a<0)
              {
                    System.out.println("Given Number is Negative");
              }
   else 
             {
                   System.out.println("Given Number is Zero");
             }
}
}


