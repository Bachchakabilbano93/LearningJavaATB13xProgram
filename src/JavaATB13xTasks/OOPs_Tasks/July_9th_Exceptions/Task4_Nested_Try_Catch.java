package JavaATB13xTasks.OOPs_Tasks.July_9th_Exceptions;

import java.util.Scanner;

public class Task4_Nested_Try_Catch {
    public static void main(String[] args) {
        /*✅ Task 4: Nested Try-Catch
📘 Description:
Write a program with a try-catch block inside another try-catch block.
Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int a = scanner.nextInt();
        System.out.println("Enter the divisor");
        int b = scanner.nextInt();
        try {
            a = a/b;
            try {
                String s = args[0];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);


    }
}
