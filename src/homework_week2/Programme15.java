/**
 * 15. Write a Java program to swap two variables.
 */
package homework_week2;

import java.util.Scanner;

public class Programme15
{
    public static void main(String[] args)
    {
      int a,b,Swap;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number a");
        a=s.nextInt();
        System.out.println("Enter number b");
        b=s.nextInt();
        Swap=a;
        a=b;
        b=Swap;
        System.out.println("Number a= "+a+" And "+"Number b = "+b);

    }

}
