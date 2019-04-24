package JAVA_Part3;
import java.util.Enumeration;
import java.util.Vector;


/*
 * add element only set in main function;
 * add sequence should be from low value to high value;
 */
public class Enumation_demo {
    private Integer ID;
    public static void main(String args[]){
        Enumeration<String> days;
        //        Vector dayNames = new Vector<>();
        Vector<String> dayNames = new Vector<String>();

        dayNames.add(0,"Sunday");
        dayNames.add(1,"Monday");
        dayNames.add(2,"Tuesday");
        dayNames.add(3,"Wednesday");
        dayNames.add(4,"Thursday");
        dayNames.add(5,"Friday");
        dayNames.add(6,"Saturday");

        days = dayNames.elements();
        for (String A:dayNames)
        {
            Integer B = dayNames.indexOf(A);
            System.out.println(B);

        }
        //        String A = dayNames.get(0);
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());

        }
    }

}
