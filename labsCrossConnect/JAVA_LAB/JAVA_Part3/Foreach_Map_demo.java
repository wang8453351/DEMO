package JAVA_Part3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Foreach_Map_demo {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");

        //first solution
        System.out.println("use Map.keySet to foreach key and value");
        for(String key:map.keySet())
        {
            System.out.println("the key is "+key+", the value is "+map.get(key));
        }

        //second solution
        System.out.println("use Map.entrySet and iterator foreach key and value");
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            //            System.out.println("the map result is "+itr.next());
            Map.Entry<String, String> entry = itr.next();
            System.out.println("the key is "+entry.getKey()+", the value is "+entry.getValue());
        }

        //third solution
        System.out.println("use Map.entrySet to foreach key and value");
        for (Map.Entry<String, String> entry1:map.entrySet())
        {
            System.out.println("key is "+entry1.getKey()+", value is "+entry1.getValue());
        }

        //Fourth solution
        System.out.println("use Map.values to foreach key and value");
        for(String v:map.values())
        {
            System.out.println("value = "+v);
        }

    }

}
