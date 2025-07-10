package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

public class Task9_Try_Block_Without_Exception {
    public static void main(String[] args) {
        /*✅ Task 9: Try Block Without Exception
📘 Description:
Write a try block that does not throw any exception.
Verify that the catch block is skipped and finally still runs.*/

        int a = 0;
        try {
            a = 10/2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always run");
            System.out.println(a);
        }
    }
}
