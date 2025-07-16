package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task5_First_Non_Repeated_Character {
    public static void main(String[] args) {
        /*5. Program: Find First Non-Repeated Character
📘 Description:
Prints the first character that appears only once using LinkedHashMap.
Input:→"aabbccdeeff"
Output:→ First non-repeated character is: d*/

        String input = "aabbccdeeff";
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for (char c : input.toCharArray()){
            lhm.put(c, lhm.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : lhm.entrySet()){
            if(entry.getValue() == 1) {
                System.out.println("First non-repeated character is: " + entry.getKey());
                return;
            }
        }
    }
}
