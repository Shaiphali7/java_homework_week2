/**
 * 8. Write a program to calculate the area of a triangle.
 */

package homework_week2;

import java.util.Scanner;

public class Programme8
{
    double b,h,A;
    public void areaOfTriangle(double a, double b)
    {
     Programme8 obj= new Programme8();
        A = 0.5*(b*h);
        System.out.println("Area of triangle= "+A);

    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of base and height");
        Programme8 obj= new Programme8();
        obj.b=s.nextDouble();
        obj.h=s.nextDouble();
    obj.areaOfTriangle(obj.b,obj.h);
    }

}
