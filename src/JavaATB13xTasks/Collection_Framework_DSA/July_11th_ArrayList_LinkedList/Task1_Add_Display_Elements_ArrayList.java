package JavaATB13xTasks.Collection_Framework_DSA.July_11th_ArrayList_LinkedList;

import java.util.ArrayList;

public class Task1_Add_Display_Elements_ArrayList {
    public static void main(String[] args) {
        /*1. Add and Display Elements in ArrayList
📘 Description:
Create an ArrayList of student names. Add the following 5 students:
Dipak, Ravi, Sneha, Priya, Anjali.
Then display all names using a loop.
✅ Expected Output:
Student List:
Dipak
Ravi
Sneha
Priya
Anjali*/

        ArrayList arrayList = new ArrayList();
        arrayList.add("Dipak");
        arrayList.add("Ravi");
        arrayList.add("Sneha");
        arrayList.add("Priya");
        arrayList.add("Anjali");
        System.out.println("Student List:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
