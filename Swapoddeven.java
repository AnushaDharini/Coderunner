import java.util.Scanner;

public class Swapoddeven
{
   public static void main(String[] input)
       {
           String str1,str2,strtemp;
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter First String:");
           str1 = scan.nextLine();
           System.out.println("Enter Second String:");
           str2 = scan.nextLine();
          
            System.out.println("\nStrings before swapping are:");
            System.out.println("String 1="+str1+ "\n");
            System.out.println("String 2="+str2+ "\n");
            strtemp = str1;
            str1=str2;
            str2=strtemp;
            System.out.println("\nStrings after Swapping are:");
            System.out.println("String 1="+str1+ "\n");
            System.out.println("String 2="+str2+ "\n");
     }
}
