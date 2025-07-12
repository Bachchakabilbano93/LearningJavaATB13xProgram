package JavaATB13xTasks.Collection_Framework_DSA.July_11th_ArrayList_LinkedList;

import java.util.ArrayList;

public class Task2_Remove_Element_ArrayList {
    public static void main(String[] args) {
        /*2. Remove an Element from ArrayList
📘 Description:
Create an ArrayList with these names: Amit, Neha, Suresh.
Remove the name Neha and display the updated list.
✅ Expected Output:
Names after removal:
[Amit, Suresh]*/

        ArrayList names = new ArrayList();
        names.add("Amit");
        names.add("Neha");
        names.add("Suresh");
//        System.out.println("Names before removal: " + names);
        names.remove("Neha");
//        names.remove(1);
        System.out.println("Names after removal: \n" + names);
    }
}
