import java.util.*;
import java.lang.*;
import java.io.*;
 class Countdigit 
 {  
 public static void main(String[] args)
         {       int digit,no=0 ,i;
                System.out.println("Enter the value of N:");
               Scanner s = new Scanner(System.in);
               digit= s.nextInt();
              while(digit>0){
                   digit/=10;
                      no++;
        }
                System.out.println("Number of digits in the given number is:" +no);
        }
}
