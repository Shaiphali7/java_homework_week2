/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
package homework_week2;

import java.util.Scanner;

public class Programme18
{
public static void addition(int a, int b)
{
    int Add=a+b;
    System.out.println(a+" + "+b+" = "+ Add);

}
public void sub(int a, int b)
{
    int Sub=a-b;
    System.out.println(a+" - "+b+" = "+ Sub);

}
public static void multi(int a, int b)
{
    int Mul=a*b;
    System.out.println(a+" * "+b+" = "+ Mul);

}
    public void Division(int a, int b)
    {
        int Div=a/b;
        System.out.println(a+" / "+b+" = "+ Div);

    }
    public void remainder(int a, int b)
    {
        int Rem=a%b;
        System.out.println(a+" mod "+b+" = "+ Rem);

    }

    public static void main(String[] args)
    {
      Programme18 obj= new Programme18();
        Scanner s= new Scanner(System.in);
        System.out.println("Input first number");
        int a=s.nextInt();
        System.out.println("Input second number");
        int b=s.nextInt();
        addition(a,b);
        obj.sub(a,b);
        Programme18.multi(a,b);
        obj.Division(a,b);
        obj.remainder(a,b);
    }

}
