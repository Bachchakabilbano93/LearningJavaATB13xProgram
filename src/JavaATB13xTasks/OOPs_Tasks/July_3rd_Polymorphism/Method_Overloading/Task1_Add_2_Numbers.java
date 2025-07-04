package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overloading;

public class Task1_Add_2_Numbers {
    public static void main(String[] args) {
        /*Task 1: Add Two Numbers
        Title: Overload a method to add different types of numbers
        Description:
        Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
        The int version should add two integers.
        The double version should add two decimal numbers.
        In the main method, call both versions to demonstrate how overloading works with data types.*/

        Calculator c = new Calculator();
        int int_result = c.add(2,3);
        double double_result = c.add(9.25, 13.75);
        System.out.println(int_result);
        System.out.println(double_result);

    }
}

class Calculator{

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
