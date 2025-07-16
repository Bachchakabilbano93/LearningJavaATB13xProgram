package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.HashMap;

public class Task1_Word_Frequency_Counter {
    public static void main(String[] args) {
        /*1. Program: Word Frequency Counter Using HashMap
📘 Description:
Takes a sentence and prints how many times each word appears using HashMap.
Input: "java is easy and java is powerful"
Output:
java -> 2
is -> 2
easy -> 1
and -> 1
powerful -> 1*/

        String input = "java is easy and java is powerful";
        HashMap<String, Integer> hm = new HashMap();
        for (String s : input.split(" ")) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        for (String s : hm.keySet()){
            System.out.println(s + " -> " + hm.get(s));
        }

    }
}
