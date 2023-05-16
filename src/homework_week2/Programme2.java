/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

package homework_week2;

public class Programme2 {

static int stack=100;
static String name="Java programme with static variable and method";
 public static void myStatic()
 {
     System.out.println(Programme2.stack);
     System.out.println(name);

 }

    public static void main(String[] args)
    {
       myStatic();
    }
}
