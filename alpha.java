import java.util.*;
import java.lang.*;
import java.io.*;
 class alpha
 {  
 public static void main(String[] args)
{ 
             char variable;
             Scanner s = new Scanner(System.in);
            System.out.println("Enter the variable:");
            variable= s.next().charAt(0);
       if(variable>='a'&&variable<='z')
              { 
                    System.out.println("Given character is Alphabet");
              }
     else 
              {
                    System.out.println("Given character is not Alphabet");
              }
   
}
}


