import java.util.*;
import java.lang.*;


public class prog2
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner ini = new Scanner(System.in);
        int num = ini.nextInt();

        if(num % 2 == 0 && (num>20 && num<30))
            System.out.println("\nJerry\n");

        if(num % 2 != 0 && (num>20 && num<30))
            System.out.println("\nTom\n");

    }

}