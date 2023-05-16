package homework_week2;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {

    int a = 100;   //Instance variable declaration
    String home = "Java programme with instance variable and method";

    public void myMethod() {

        Programme1 my = new Programme1();
        System.out.println(my.a);
        System.out.println(my.home);
    }

    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        obj.myMethod(); //Calling instance method
    }

}
