import java.util.*;
import java.lang.*;
import java.io.*;
class Stringtointeger
{
     public static void main(String[] args)
        {
            String str;
            int i;
            System.out.println("Enter a String:");
            Scanner s=new Scanner(System.in);
            str=s.next();
            i=Integer.parseInt(str);
            System.out.println("Result :"+i);
       }
}
