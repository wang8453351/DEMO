package JAVA_Part3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIst_demo {

    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAAA");

        //first foreach
        System.out.println(list);
        for(String str:list){
            System.out.println(str);

        }

        //second foreach
        String strArray[] = new String[list.size()];
        list.toArray(strArray);
        for(int i= 0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }

        //third foreach
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
