package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

import java.util.Scanner;

public class Task2_Try_Catch_Multiple_Catch {
    public static void main(String[] args) {
        /*✅ Task 2: Try-Catch with Multiple Catch Blocks
📘 Description:
Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException and handle them with multiple catch blocks.
🧤 Expected Output:
Print which exception occurred.*/
        Scanner scanner = new Scanner(System.in);
        String s = args[0];
        System.out.println("Enter the divisor:");
        int i = scanner.nextInt();
        int b = 0;

        try {
            int a = Integer.parseInt(s);
            b = a/i;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println(b);
    }
}
