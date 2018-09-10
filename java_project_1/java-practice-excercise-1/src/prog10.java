import java.util.*;
import java.lang.*;

class prog10
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ini = new Scanner(System.in);
        String str = ini.nextLine();
        int num = ini.nextInt();
        int len = str.length();
        String strr = str.substring(len-num,len);

        System.out.print(str);

        for(int i=0;i<num;i++)
            System.out.print(strr);

    }
}
