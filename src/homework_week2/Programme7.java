/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C
 */

package homework_week2;

import java.util.Scanner;

public class Programme7
{
float C;

 public void convertFtoC(float F)
{
    C=((F-32)*5)/9;
    System.out.println("Fahrenheit to Celsius is= "+C);

}
public static void main(String[] args)
{
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the value of Fahrenheit");
    float R= s.nextFloat();
    Programme7 obj= new Programme7();
    obj.convertFtoC(R);
}
}
