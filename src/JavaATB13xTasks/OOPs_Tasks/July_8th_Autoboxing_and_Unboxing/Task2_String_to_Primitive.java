package JavaATB13xTasks.OOPs_Tasks.July_8th_Autoboxing_and_Unboxing;

public class Task2_String_to_Primitive {
    public static void main(String[] args) {
        /*Task 2: Converting String to Primitive Using Wrapper
📘 Description:
Use Integer.parseInt() to convert a string (e.g. "123") into a primitive int and print it.
📤 Expected Output:
Parsed number: 123*/

        String num = "123";
        int i = Integer.parseInt(num);
        System.out.println("Parsed number: " + i);

    }
}
