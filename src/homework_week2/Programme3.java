/**
 * 3. Write a Java programme using the following steps.
 *         3.1 Declare one instance and one static variable.
 *         3.2 Declare one instance method.
 *         3.3 Declare one static method.
 *         3.4 Call both instance and static variables into both instance and static methods inside the
 *         print statement.
 *         3.5 Declare the Main method.
 *         3.6 Call both instance and static methods into the Main method and run the programme
 */

package homework_week2;

public class Programme3 {
    int num=100; //instance variable
    static String str="One instance and one static variable"; // static variable
    public void inst()    //instance method
    {
       Programme3 p1= new Programme3();
        System.out.println(p1.num);
        System.out.println(str);

    }
    public static void sta() //static method
    {
       Programme3 s1= new Programme3();
        System.out.println(s1.num);
        System.out.println(Programme3.str);


    }

    public static void main(String[] args)
    {
        Programme3 m1=new Programme3();
        m1.inst();
        Programme3.sta();
    }
}
