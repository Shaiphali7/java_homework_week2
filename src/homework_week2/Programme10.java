/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
package homework_week2;

import java.util.Scanner;

public class Programme10
{
static int a;
public static void printTable(int b,int c)
{
    int Ans=b*c;
    System.out.println(b+" x "+c+" = "+Ans);

}

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any integer number between 1-20");
        a= s.nextInt();
        printTable(a,1);
        printTable(a,2);
        printTable(a,3);
        printTable(a,4);
        printTable(a,5);
        printTable(a,6);
        printTable(a,7);
        printTable(a,8);
        printTable(a,9);
        printTable(a,10);


    }
}
