package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

public class Task1_Basic_Try_Catch_Arithmetic {
    public static void main(String[] args) {
        /*Task 1: Basic Try-Catch with ArithmeticException
📘 Description:
Divide a number by zero and handle the exception.
🧤 Expected Output:
Catch ArithmeticException and print a friendly message.*/
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
    }
}
