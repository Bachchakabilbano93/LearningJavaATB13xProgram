package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Task3_Sort_Map_TreeMap {
    public static void main(String[] args) {
        /*3. Program: Sort Map by Keys Using TreeMap
📘 Description:
Store data in HashMap, then transfer to TreeMap to sort by keys.
 Input: {"Ravi": 80, "Anjali": 95, "Dipak": 75}
Output:
Anjali = 95
Dipak = 75
Ravi = 80*/

        HashMap marks = new HashMap();
        marks.put("Ravi",80);
        marks.put("Anjali",95);
        marks.put("Dipak",75);

        TreeMap treeMarks = new TreeMap(marks);
        for (Object key : treeMarks.keySet()){
            System.out.println(key + " = " + treeMarks.get(key));
        }

    }
}
