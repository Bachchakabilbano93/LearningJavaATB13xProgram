package JavaATB13xTasks.Collection_Framework_DSA.July_11th_ArrayList_LinkedList;

import java.util.LinkedList;

public class Task3_Reverse_LinkedList {
    public static void main(String[] args) {
        /*3. Reverse a LinkedList
📘 Description:
Create a LinkedList and add the following numbers:
10, 20, 30, 40.
Reverse the list and print the output.
✅ Expected Output:
Reversed List:
[40, 30, 20, 10]*/

        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l = l.reversed();
        System.out.println("Reversed List: \n" + l);
    }
}
