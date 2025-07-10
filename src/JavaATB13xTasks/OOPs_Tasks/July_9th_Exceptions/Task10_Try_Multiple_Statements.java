package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

public class Task10_Try_Multiple_Statements {
    public static void main(String[] args) {
        /*✅ Task 10: Try With Multiple Statements
📘 Description:
Write multiple statements in a try block.
Ensure if the first fails, the rest are not executed, and control goes to catch.*/

        int a = 0;
        int b = 2;
        try {
            String s = args[0];
            a = 2 + 3;
            int c = a * b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
