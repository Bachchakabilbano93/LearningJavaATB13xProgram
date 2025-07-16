package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.HashMap;

public class Task8_Find_Most_Frequent_Character {
    public static void main(String[] args) {
        /*8. Program: Find Most Frequent Character in String
📘 Description:
Count frequency of characters and find the one with the highest count.
Input: "aaaabbbcc"
Output:  Most frequent character is: a (4 times)*/

        String input = "aaaabbbcc";
        char mostFreqChar = ' ';
        HashMap<Character, Integer> inputMap = new HashMap<>();
        int maxCount = 0;

        for (char c : input.toCharArray()){
            inputMap.put(c, inputMap.getOrDefault(c, 0) + 1);
            if (inputMap.get(c) > maxCount){
                maxCount = inputMap.get(c);
                mostFreqChar = c;
            }
        }

        System.out.println("Most frequent character is: " + mostFreqChar + " (" + maxCount + " times)");
    }
}
