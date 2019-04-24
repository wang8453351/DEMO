package JAVA_Part3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

@SuppressWarnings("rawtypes")
class Mycompare implements Comparator<Object>{
    @Override
    public int compare(Object o1,Object o2){
        Elem e1 = new Elem(o1);
        Elem e2 = new Elem(o2);
        //        Elem e1 = (Elem)o1;
        //        Elem e2 = (Elem)o2;
        int  k = 0;
        int size =0;
        if (e1.get().length>e2.get().length)
        {
            size = e1.get().length;
        }
        else
        {
            size = e2.get().length;
        }
        char[] e1_array =e1.get();
        char[] e2_array = e2.get();
        for (int i =0;i<size;i++)
        {
            char e1_char = e1_array[i];
            char e2_char = e2_array[i];
            if ((e1_char<='Z'&&e2_char>='a')||(e2_char<='Z'&&e1_char>='a'))
            {
                k =-1;
                break;
            }
            if (e1_char != e2_char)
            {

                if (e1_char > e2_char)
                {
                    k=1;
                    break;
                }
                else if (e1_char < e2_char)
                {
                    k =-1;
                    break;
                }
            }
            else {
                k=0;
                continue;
            }
        }
        return k;

    }

    class Elem {
        private char[] iVal;
        public Elem(Object i){
            //            i.toCharArray();
            this.iVal = i.toString().toCharArray();
        }

        public char[] get(){
            return this.iVal;
        }
    }



}
public class Hash_table_demo {


    @SuppressWarnings("unchecked")

    public static void main (String args[]){
        //create a hash map
        @SuppressWarnings("rawtypes")
        //        Hashtable balance = new Hashtable();
        //        LinkedHashMap balance = new LinkedHashMap<>();
        TreeMap balance = new TreeMap<>();
        @SuppressWarnings("rawtypes")
        Enumeration names;
        String str;
        double bal;
        balance.put("AO", new Double(342.12));
        balance.put("aO", new Double(3422.12));
        balance.put("AP", new Double(3142.12));
        balance.put("BTY", new Double(1342.12));
        balance.put("CPN", new Double(12342.12));

        Set keys = balance.keySet();
        Vector<Object> dayNames = new Vector<Object>();
        if (keys !=null){
            Iterator iterator = keys.iterator();
            while(iterator.hasNext()){
                Object key = iterator.next();
                System.out.println("key is "+key);
                dayNames.add(key);

            }
        }
        //        Collections.sort(dayNames,Collections.reverseOrder());
        //        Collections.sort(dayNames);
        //        String[] str1 = null ;
        //        for(int i=0;i<dayNames.size();i++){
        //
        //            str1[i] = dayNames.get(i);
        //        }
        //
        //        Arrays.sort(str1);
        //        for(int i=0;i<dayNames.size();i++){
        //
        //            //           str1[i] = dayNames.get(i);
        //            dayNames.set(i, str1[i]);
        //        }
        Mycompare ct = new Mycompare();
        //        dayNames.sort(ct);
        Collections.sort(dayNames,ct);

        names = dayNames.elements();



        //        names = balance.key
        //        names=balance.keys();
        while(names.hasMoreElements())
        {
            //            System.out.println("All Names :"+names.nextElement());
            //the sequence is not right; in mess;

            str = (String)names.nextElement();
            System.out.println(str + " : "+ balance.get(str));
        }

        //        bal = ((Double) balance.get("Zara")).doubleValue();
        //        balance.put("Zara", new Double(bal+1000));
        //        System.out.println("Zara new balance is "+balance.get("Zara"));

    }
}
