/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

package homework_week2;

import java.util.Scanner;

public class Programme5
{
    public static void addition(int a, int b)
    {
     int A=a+b;
        System.out.println(a+" + "+b+" = "+A);

    }
    public static void subtration(int a,int b)
    {
        int B=a-b;
        System.out.println(a+" - "+b+" = "+B);

    }

    public void multiplication(int a, int b)
    {

        int C=a*b;
        System.out.println(a+" * "+b+" = "+C);
    }
    public void division(int a, int b)
    {
        int D=a/b;
        System.out.println(a+" / "+b+" = "+D);

    }

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the two number");
        int a= s.nextInt();
        int b=s.nextInt();
        Programme5 obj= new Programme5();
        Programme5.addition(a,b);
        Programme5.subtration(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);

    }
}
