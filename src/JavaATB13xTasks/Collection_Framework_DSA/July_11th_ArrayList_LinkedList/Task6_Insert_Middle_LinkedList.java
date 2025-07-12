package JavaATB13xTasks.Collection_Framework_DSA.July_11th_ArrayList_LinkedList;

import java.util.LinkedList;

public class Task6_Insert_Middle_LinkedList {
    public static void main(String[] args) {
        /*📘 Description:
Create a LinkedList with fruits: Apple, Banana, Mango.
Insert Orange at index 1 and print the final list.
✅ Expected Output:
Fruits List: [Apple, Orange, Banana, Mango]*/

        LinkedList<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1, "Orange");

        System.out.println("Fruits List: " + fruits);

    }
}
