/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
package homework_week2;

import java.util.Scanner;

public class Programme13
{
public void average(int a,int b,int c)
{

    float avg=(a+b+c)/3;
    System.out.println("Average of three number is= "+avg);

}

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the three number");
        int x= s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        Programme13 obj =new Programme13();
        obj.average(x,y,z);

    }
}
