package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overloading;

public class Task3_Multiply_Numbers {
    public static void main(String[] args) {
        /*Task 3: Multiply Numbers
        Title: Multiply using overloaded methods
        Description:
        Create a class MathOperations with two multiply() methods:
        One takes two integers and returns the product
        Another takes three integers and returns their product
        This helps students understand how Java distinguishes methods based on parameter count.*/

        MathOperations m = new MathOperations();
        int result_2int= m.multiply(4,6);
        int result_3int = m.multiply(4,8,12);
        System.out.println(result_2int);
        System.out.println(result_3int);

    }
}

class MathOperations{
    int multiply(int a, int b){
        return a * b;
    }

    int multiply(int a, int b, int c){
        return a * b * c;
    }
}
