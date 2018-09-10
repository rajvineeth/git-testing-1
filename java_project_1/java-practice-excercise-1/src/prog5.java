import java.util.*;
import java.lang.*;

class prog5
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ini = new Scanner(System.in);
        String str = ini.nextLine();
        int len = str.length();
        String making="";
        int count = 0,num,sum = 0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i) == ' ' || str.charAt(i) == '\n')
            {
                num = Integer.parseInt(making);
                sum += num;
                making="";
                continue;
            }
        making += str.charAt(i);
        }
        num = Integer.parseInt(making);
        sum += num;
        System.out.println("\n Sum = "+sum);

    }
}
