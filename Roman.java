import java.util.*;
import java.lang.*;
import java.io.*;
public class Roman{
              public static void main(String[] args)
              {
                  String rn="";
                  String rnum;
                  char c;
                  System.out.println("Enter Roman Numeral:");
                  Scanner s=new Scanner(System.in);
                  rn=s.next();
                  rnum=rn.toUpperCase();
                  int i,value=0;
                  for(i=0;i<rnum.length();i++)
                  {
                      c=rnum.charAt(i);
                        switch(c){
                            case'M':{
                                value=value+1000;
                                System.out.println(value);
                                break;
                            }
                             case'D':{
                                value=value+500;
                                System.out.println(value);
                                break;
                            } case'C':{
                                value=value+100;
                                System.out.println(value);
                                break;
                            } case'L':{
                                value=value+50;
                                System.out.println(value);
                                break;
                            }
                             case'X':{
                                value=value+10;
                                System.out.println(value);
                                break;
                            }
                              case'V':{
                                value=value+5;
                                System.out.println(value);
                                break;
                            }
                               case'I':{
                                value=value+1;
                                System.out.println(value);
                                break;
                            }
                               default:{
                                   System.out.println("Enter correct value:");
                            }
                        }
                  }
              }
    
}

