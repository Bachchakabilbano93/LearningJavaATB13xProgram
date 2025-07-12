package JavaATB13xTasks.Collection_Framework_DSA.July_11th_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4_Find_Element_ArrayList {
    public static void main(String[] args) {
        /*4. Find an Element in ArrayList
📘 Description:
Create an ArrayList of cities: Mumbai, Delhi, Pune.
Check if Pune is present in the list. Print a message accordingly. (you can use If Condition to check the Pune city and you can take the City name from User)
✅ Expected Output:
Pune is in the list.*/

        ArrayList cityNames = new ArrayList();
        cityNames.add("Mumbai");
        cityNames.add("Delhi");
        cityNames.add("Pune");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name: ");
        String city = scanner.next();
        if(cityNames.contains(city)){
            System.out.println(city + " is in the list");
        }

    }
}
