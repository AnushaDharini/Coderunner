/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lotus
 */
import java.util.Scanner;

public class Primeornot {
            public static void main(String args[])
            {
                int num,i,count=0;
                Scanner scan = new Scanner(System.in);
                
                System.out.println("Enter a number:");
                num = scan.nextInt();
                for(i=2;i<num;i++)
                {
                    if(num%i==0)
                    {
                        count++;
                        break;
                        
                    }
                }
                if(count==0)
                {System.out.println("This is a prime number");
                }
                else
                {
                    System.out.println("This is not a prime number");
                }
                }
            }       

