package JavaATB13xTasks.Collection_Framework_DSA.July_15th_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6_Group_Words_Using_Map {
    public static void main(String[] args) {
        /*6. Program: Group Words by Length Using Map
📘 Description:
Group words based on their length using Map<Integer, List<String>>.
Input: ["Java", "is", "fun", "cool", "Hi"]
Output:
 2 -> [is, Hi]
3 -> [fun]
4 -> [Java, cool]*/

        String[] words = {"Java", "is", "fun", "cool", "Hi"};
        Map<Integer, List<String>> wordMap = new HashMap<>();
        for (String word: words){
            int length = word.length();
            if(!wordMap.containsKey(length)){
                List<String> list = new ArrayList<String>();
                wordMap.put(length, list);
            }
            wordMap.get(length).add(word);
        }

        for(Map.Entry<Integer, List<String>> entry: wordMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
