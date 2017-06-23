import java.util.Scanner;
public class Displayeven 
{
    public static void main(String args[])
    {
        int a=0;
        System.out.println("Enter the limit:");
        Scanner num=new Scanner(System.in);
        a=num.nextInt();
         System.out.println("even numbers are:");
         for(int i=1;i<=a;i++)
         {
             if(i%2==0){
                 System.out.println(+i);
             }
         }
    }
}
