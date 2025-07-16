package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.HashMap;

public class Task4_Character_Frequency_Counter {
    public static void main(String[] args) {
        /*4. Program: Character Frequency Counter
📘 Description:
Count how many times each character appears in a string using HashMap.
Input:
"aabbccddeeff"
Output:
a -> 2
b -> 2
c -> 2
d -> 2
e -> 2
f -> 2*/

        String input = "aabbccddeeff";
        HashMap<Character, Integer> freqCount = new HashMap();
        for (char c : input.toCharArray()){
            freqCount.put(c, freqCount.getOrDefault(c, 0 ) + 1);
        }

        for (char o : freqCount.keySet()){
            System.out.println(o + " -> " + freqCount.get(o));
        }
    }
}
