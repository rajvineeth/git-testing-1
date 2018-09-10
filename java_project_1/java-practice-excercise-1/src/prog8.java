import java.util.*;
import java.lang.*;

class prog8
{
    public static void main(String[] args) throws java.lang.Exception
    {


        int target = 67;

        int start = 0, end=100, iteration = 1;

        System.out.println("\nEnter number between "+start+" and "+end);

        Scanner ini = new Scanner(System.in);
        int num = ini.nextInt();

        while(num != target)
        {
            System.out.println("iteration "+iteration);
            iteration++;



            if(num > target)
            {
                end = num;
            }

            else if(num < target)
            {
                start = num;
            }

            System.out.println("\nEnter number between "+start+" and "+end);

            ini = new Scanner(System.in);
            num = ini.nextInt();

        }

        if(num==target)
        {
            System.out.println("Target Found");
        }

    }
}