import java.util.*;
import java.lang.*;

class prog4
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ini = new Scanner(System.in);
        int num = ini.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
        }
    }
}
