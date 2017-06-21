import java.util.*;
import java.lang.*;
import java.io.*;
 class sumnatural
 {  
 public static void main(String[] args)
       { 
             int i ,n,sum=0;
              System.out.println("Enter the number of count of natural numbers:");
             Scanner s = new Scanner(System.in);
             n= s.nextInt();
                 for(i=0;i<n;i++)
                      {         sum=sum+i;
                       }
                      System.out.println("sum of natural number:" +sum);
                         
        }
}
