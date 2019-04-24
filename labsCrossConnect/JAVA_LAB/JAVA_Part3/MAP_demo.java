package JAVA_Part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MAP_demo {
    public static void main(String[] args){
        Map<String, String> m1 = new TreeMap();
        m1.put("ZARA", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ana", "12");
        m1.put("Dais", "14");

        System.out.println("Map Elements");
        System.out.println("\t"+m1);


        Map<String, List<String>> m2 = new TreeMap<>();
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAAA");
        m2.put("1", list);
        if(m1.containsKey("Ana")) {
            m1.get("Ana");
        }

    }
}
