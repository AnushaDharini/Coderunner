import java.util.Scanner;

public class Armstrongrange {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range:");
        int range =s.nextInt();
        int a,b,c,sum,count=0;
        b=1;
        while(b<=range)
        {
            sum=0;
            c=b;
            while(c>0)
            {
                a=c%10;
                sum=sum+(a*a*a);
                c=c/10;
            }
            if(sum==b)
            {
                System.out.println(b+"is a Armstrong number");
                count=count+1;
            }
            b++;
        }
               System.out.println("Total Armstrong number present with in that range is"+count);
    }
    
}
