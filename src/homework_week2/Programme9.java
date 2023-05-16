/**
 * 9. Write a program to convert the upper case to lower case.
 */
package homework_week2;

import java.util.Scanner;

public class Programme9
{
    public void lowerCase(String s)
    {

        String s1 = s.toLowerCase();
        System.out.println("New string is =  "+s1);
    }
    public static void main(String[] args)
    {

        System.out.println("Enter the string in capital letter");
        Scanner p= new Scanner(System.in);
        String s=p.next();
        Programme9 obj= new Programme9();
        obj.lowerCase(s);

    }

}
