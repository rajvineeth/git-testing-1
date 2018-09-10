import java.util.*;
import java.lang.*;
import java.io.*;

class prog3
{
    public static void main (String[] args)
    {
        Scanner ini = new Scanner(System.in);
        String str = ini.nextLine();
        int len = str.length();

        if(! (str.matches("[A-Za-z]+")) )
        {
            System.out.println("Invalid String Man!!");
        }

        else
            {
                  for(int i = 0; i < len; i++)
                {
                  if( str.charAt(i)=='a' || str.charAt(i)=='A' ||
                          str.charAt(i)=='e' || str.charAt(i)=='E' ||
                          str.charAt(i)=='i' || str.charAt(i)=='I' ||
                          str.charAt(i)=='o' || str.charAt(i)=='O' ||
                          str.charAt(i)=='u' || str.charAt(i)=='U')
                  {
                      System.out.println(" Vowel ");
                  }
                  else
                  {
                      System.out.println(" Consonent ");
                  }
                }
            }
    }
}
