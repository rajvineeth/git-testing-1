import java.util.*;
import java.lang.*;

class prog7
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ini = new Scanner(System.in);
        String str = ini.nextLine();
        int len = str.length();
        int array[];
        array = new int[len];

        for(int i=0;i<len;i++)
            array[i] = str.charAt(i) - '0';

        Arrays.sort(array);

        for( int i = 0; i < len/2; ++i )
        {
           int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        int sum = 0;

        System.out.print("\nNumber = ");

        for(int i=0;i<len;i++)
        {
            System.out.print(array[i]);
            if(array[i]%2==0)
                sum += array[i];
        }

        System.out.print("\n");
        System.out.println("Sum = "+sum);

        if(sum>15)
            System.out.println("True");

        else
            System.out.println("False");
    }
}
