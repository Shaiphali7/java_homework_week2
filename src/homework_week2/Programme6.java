/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */

package homework_week2;
import java.util.Scanner;

public class Programme6
{
    public static void area(float r)
    {
        double Area = Math.PI*r*r;
        System.out.println("Area of Circle is= "+ Area);

    }

    public static void main(String[] args)
    {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the value of Radius");
        float R= s1.nextFloat();
        Programme6.area(R);

    }

}
