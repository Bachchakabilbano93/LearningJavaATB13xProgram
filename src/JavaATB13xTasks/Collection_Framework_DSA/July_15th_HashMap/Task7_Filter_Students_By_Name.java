package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.HashMap;

public class Task7_Filter_Students_By_Name {
    public static void main(String[] args) {
        /*7. Program: Filter Students by Name Starting with 'A'
📘 Description:
Store roll numbers and names in a HashMap, print only those starting with 'A'.
Input: {101="Anjali", 102="Dipak", 103="Aman", 104="Ravi"}
Output:
101 -> Anjali
103 -> Aman*/

        HashMap<Integer, String> names = new HashMap<>();
        names.put(101, "Anjali");
        names.put(102, "Dipak");
        names.put(103, "Aman");
        names.put(104, "Ravi");

        for (Integer key : names.keySet()){
            if(names.get(key).startsWith("A")){
                System.out.println(key + " -> " + names.get(key));
            }
        }
    }
}
