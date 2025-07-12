package JavaATB13xTasks.Collection_Framework_DSA.July_11th_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5_ArrayList_vs_LinkedList_Performance {
    public static void main(String[] args) {
        /*5. Compare ArrayList vs LinkedList Performance
📘 Description (Updated with Hints):
In this program, you’ll compare how fast Java can add elements to an ArrayList versus a LinkedList.
You will:
Create two separate lists: one ArrayList and one LinkedList.
Add 100,000 numbers (from 0 to 99,999) to each list using a loop.
Use System.currentTimeMillis() to measure how much time it takes to add the elements.
Print the time taken for both lists.
 Hint :-
 :-  System.currentTimeMillis() gives you the current time in milliseconds.
 :-  Subtract the end time from the start time to get the duration.
 :-  You don’t need to print all the 100,000 numbers, just print the time taken.
✅ Expected Output:
ArrayList time: 8 ms
LinkedList time: 12 ms*/

        ArrayList a = new ArrayList();
        LinkedList l = new LinkedList();
        long startTime_ArrayList = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            a.add(i);
        }
        long endTime_ArrayList = System.currentTimeMillis();
        long arrayList_Time = endTime_ArrayList - startTime_ArrayList;
        System.out.println("Arraylist time: " + arrayList_Time);

        long startTime_LinkedList = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            l.add(i);
        }
        long endTime_LinkedList = System.currentTimeMillis();
        long linkedList_time = endTime_LinkedList - startTime_LinkedList;
        System.out.println("LinkedList time: " + linkedList_time);

    }
}
