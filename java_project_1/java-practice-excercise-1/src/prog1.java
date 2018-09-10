/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// primary class
public class prog1 {
    // main method
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ini = new Scanner(System.in);
        int num = ini.nextInt();
        check(num);
    }

    public static void check(int num)
    {
        int length, a, b, sum_even = 0;
        boolean val = true;

        length = len_calculator(num);

//        System.out.println("length = "+length+"\n");

        while (length > 0)
        {
            if(length == 1)
            {
                sum_even += num;
                break;
            }

//            System.out.println("num = "+num+"\n");

            a = (int)Math.pow(10,length-1);
            a = num / a;
            if (a % 2 == 0)
                sum_even += a;

//            System.out.println("a = "+a+"\n");

            num = num - a * (int)Math.pow(10,length-1);

            b = num % 10;
            if (b % 2 == 0)
                sum_even += b;

//            System.out.println("b = "+b+"\n");

            num = num / 10;
            length = length - 2;


            if (a != b) {
                System.out.println("\n Not a Palindrome");
                val = false;
                break;
            }
        }

        if (val)
            System.out.println("\n Palindrome");


//        System.out.println("sum_even = "+sum_even+"\n");


        if (sum_even > 25)
            System.out.println("\n The Sum of Even exceed 25 \n");
        else
            System.out.println("\n The Sum of Even doesn't exceed 25 \n");

    }

    public static int len_calculator(int num)
    {
        int len1 = 0;
        while (num!=0)
        {
            num = num / 10;
            len1++;
        }
        return len1;
    }

}


