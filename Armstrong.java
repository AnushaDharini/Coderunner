import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String args[])
    {
        int n,nu,num=0,rem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive number:");
        n=scan.nextInt();
        nu=n;
        while(nu!=0)
        {
            rem=nu%10;
            num=num+rem*rem*rem;
            nu=nu/10;
        }
        if(num==n)
        {
             System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
  }

