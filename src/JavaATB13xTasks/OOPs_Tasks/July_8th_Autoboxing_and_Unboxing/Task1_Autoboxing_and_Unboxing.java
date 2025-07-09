package JavaATB13xTasks.OOPs_Tasks.July_8th_Autoboxing_and_Unboxing;

public class Task1_Autoboxing_and_Unboxing {
    public static void main(String[] args) {
        /*Task 1: Autoboxing and Unboxing
📘 Description:
Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).
📤 Expected Output:
Primitive: 50
Wrapper: 50
Unboxed again: 50*/

        int i = 50;
        Integer a = i;
        int b = a;
        System.out.println("Primitive: " + i);
        System.out.println("Wrapper: " + a);
        System.out.println("Unboxed again: " + b);

    }
}
