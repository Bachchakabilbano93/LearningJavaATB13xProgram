package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

public class Task8_Throw_Exception_Catch {
    public static void main(String[] args) {
        /*✅ Task 8: Throw Exception and Catch It
📘 Description:
Manually throw an exception using throw new ArithmeticException() and catch it.*/

        try {
            throw new ArithmeticException("This is a manual ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
