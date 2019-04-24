package JAVA_Part3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class Properity_demo {
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("A_key", "A_value");
        capitals.put("B_key", "B_value");
        capitals.put("C_key","C_value");
        capitals.put("D_key", "D_value");
        capitals.setProperty("F_key", "F_value");

        //Show all states and capitals in hashtable
        states = capitals.keySet();
        Vector vr = new Vector();
        Iterator itr = states.iterator();
        while (itr.hasNext()) {
            str  = (String) itr.next();
            System.out.println("the capitals of "+ str + " IS "+capitals.getProperty(str));
            vr.add(str);//vr.add(itr), is address in memory; should point at elements;
        }
        Mycompare ct =new Mycompare();
        vr.sort(ct);

        System.out.println();

        @SuppressWarnings("rawtypes")
        Enumeration Enum;
        String str1;
        Enum = vr.elements();
        while(Enum.hasMoreElements()){
            str1 = (String) Enum.nextElement();
            System.out.println("after sequence : "+str1.toString()+" : "+capitals.getProperty(str1.toString()));
        }
        //look for state not in list --- specify default

        str = capitals.getProperty("E_key","Not found wp");
        System.out.println("the capital of E_key is "+str +".");
    }

}
