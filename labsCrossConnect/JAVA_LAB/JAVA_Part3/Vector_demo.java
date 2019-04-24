package JAVA_Part3;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_demo {


    /*
     * vecotr(int size , int incr)
     * incr represents : for each time, increment volume;
     */
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        @SuppressWarnings("rawtypes")
        Vector v = new Vector(3,2);//size is 3, incr = 2;
        System.out.println("Initialize size: "+v.size());//0
        System.out.println("Initialize capacity : "+v.capacity());//3

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.add(3);
        v.add(4);
        //        v.add(6);
        //        v.add(8);
        System.out.println("Capacity after four additions: "+ v.capacity());//5 origin capacity is 3, incr =2;
        v.addElement(new Double(5.45));
        System.out.println("Current capacity :"+v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity :"+v.capacity());

        System.out.println("FIrst element :"+v.firstElement());

        System.out.println("last element :"+v.lastElement());

        Enumeration vEum = v.elements();
        System.out.println("\nElements in vector");
        while(vEum.hasMoreElements()) {
            System.out.println(vEum.nextElement()+" ");
        }
        if (v.contains(new Integer(7)))
        {
            //            Enumeration vEum = v.elements();
            //            System.out.println("\nElements in vector");
            //            System.out.println(vEum.nextElement());
            System.out.println();


        }




    }
}
