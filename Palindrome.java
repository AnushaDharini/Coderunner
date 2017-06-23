/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lotus
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class Palindrome {
 public static void main(String[] args){
    int a,no,b,temp=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:");
    no=s.nextInt();
    b=no;
    while(no>0)
    {
        a=no%10;
        no=no/10;
        temp=temp*10+a;
    }
    if(temp==b)
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("not Palindrome");
    }
 }
}

