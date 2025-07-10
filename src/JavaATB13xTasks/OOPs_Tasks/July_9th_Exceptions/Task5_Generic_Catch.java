package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

public class Task5_Generic_Catch {
    public static void main(String[] args) {
        /*✅ Task 5: Catch Using Exception (Generic Catch)
📘 Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.*/

        String s = null;
        try {
            s.trim();
//            int i = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
