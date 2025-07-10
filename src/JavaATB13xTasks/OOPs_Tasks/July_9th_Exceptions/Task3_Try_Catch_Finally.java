package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

public class Task3_Try_Catch_Finally {
    public static void main(String[] args) {
        /*✅ Task 3: Try-Catch-Finally
📘 Description:
Create a program with a try, a catch, and a finally block.
Demonstrate that the finally block always executes.*/
        int a = 10;
        try {
            a = a/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always run");
        }
    }
}
