package Console;

import java.util.Scanner;

public class Scaner {

    public Integer valueInt ()
    {
        Scanner scaner = new Scanner(System.in);
        int value = scaner.nextInt();
        return  value;
    }
    public String valueString()
    {
        Scanner scaner = new Scanner(System.in);
        String value = scaner.next();
        return value;
    }
}
