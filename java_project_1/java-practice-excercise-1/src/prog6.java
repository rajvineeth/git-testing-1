import java.util.*;
import java.lang.*;

class prog6
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner ini = new Scanner(System.in);
        char a = ini.next().charAt(0);

//        if(str.matches("[A-Z]*"))
//         System.out.println("\nCapital");
//
//        else if(str.matches("[a-z]+"))
//            System.out.println("\nSmall");
//
//        else if(str.matches("[0-9]+"))
//            System.out.println("\nNumber");
//
//        else
//        System.out.println("\nSpecial Character");
//

        if(a>='A' && a<='Z')
            System.out.println("\nCapital");

        else if(a>='a' && a<='z')
            System.out.println("\nSmall");

        else if(a>='0' && a<='9')
            System.out.println("\nNumber");

        else
            System.out.println("\nSpecial Character");


    }
}
