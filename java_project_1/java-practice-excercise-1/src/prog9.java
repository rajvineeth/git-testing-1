import java.util.*;
import java.lang.*;

class prog9
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ini = new Scanner(System.in);
        String str = ini.nextLine();

        StringBuilder sb = new StringBuilder(str);
        System.out.println("for "+str+" reverse "+sb.reverse().toString());
    }
}
