/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

package homework_week2;

public class Programme4 {
    String s1 = "I am instance variable";
    float Abs = 3.25F;
    static String s2 = "I am static variable";
    static char ch = 'A';

    public void inst() {
        Programme4 obj1 = new Programme4();
        System.out.println(obj1.s1);
        System.out.println(obj1.Abs);
        System.out.println(Programme4.s2);
        System.out.println(ch);
    }

    public static void stac() {
        Programme4 obj2 = new Programme4();
        System.out.println(obj2.s1);
        System.out.println(obj2.Abs);
        System.out.println(Programme4.s2);
        System.out.println(Programme4.ch);

    }

    public static void main(String[] args)
    {
       Programme4 obj3= new Programme4();
       obj3.inst();
       Programme4.stac();
    }


}
