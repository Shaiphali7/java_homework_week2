/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
package homework_week2;

import java.util.Scanner;

public class Programme16
{

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first binary number :");
        String binary1=s.next();
        System.out.print("Enter second binary number :");
        //String binary2="11";
        String binary2=s.next();
        int decimal1=Integer.parseInt(binary1,2);
        int decimal2=Integer.parseInt(binary2,2);
        int sum=decimal1+decimal2;
        String b1=Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers : "+b1);

    }
}
