/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
package homework_week2;

public class Programme14
{
    public static void main(String[] args)
    {
       float Width=5.5F;
        float Height=8.5F;
        float Area= Width*Height;
        Float Perimeter= 2*(Width*Height);
        System.out.println("Expected Output:");
        System.out.println("Area is "+Width+" * "+Height+" = "+Area);
        System.out.println("Perimeter is 2 * ("+Width+" + "+ Height+")"+" = "+Perimeter );

    }

}
