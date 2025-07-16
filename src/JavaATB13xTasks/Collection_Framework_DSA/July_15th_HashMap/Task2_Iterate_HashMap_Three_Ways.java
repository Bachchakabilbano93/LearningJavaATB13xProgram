package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2_Iterate_HashMap_Three_Ways {
    public static void main(String[] args) {
        /*2. Program: Iterate Over HashMap in Three Ways
📘 Description:
Create a map with key-value pairs and iterate using:
entrySet()
keySet()
Iterator
Input: {"Name" -> "Dipak", "Role" -> "Tester", "Level" -> "Senior"}
Output
Name -> Dipak
Role -> Tester
Level -> Senior*/

        HashMap<String, String> details = new HashMap();
        details.put("Name","Dipak");
        details.put("Role","Tester");
        details.put("Level","Senior");

//        Using entrySet()
        for (Map.Entry<String, String> item: details.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }

//        Using keySet()
        for (String s : details.keySet()){
            System.out.println(s + " -> " + details.get(s));
        }

//        Using Iterator
        Iterator iterator = details.keySet().iterator();
        while(iterator.hasNext()){
            String key = (String) iterator.next();
            System.out.println(key + " -> " + details.get(key));
        }

    }
}
