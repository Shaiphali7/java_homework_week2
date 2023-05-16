/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
package homework_week2;

import java.util.Scanner;

public class Programme17
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter decimal number :");
        int dn=s.nextInt();
        String b1= Integer.toBinaryString(dn);
        System.out.println("Binary number is : "+ b1);
    }


}
