import java.util.Scanner;
public class Displayodd 
{
    public static void main(String args[])
    {
        Scanner num=new Scanner(System.in);
        int n,i;
        System.out.println("Hey Enter Number:");
        n=num.nextInt();
        for(i=0;i<n;i++)
        {
            i=i+1;
            System.out.println(i);
        }
    }
}
