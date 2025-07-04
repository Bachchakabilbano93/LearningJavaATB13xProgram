package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overloading;

public class Task5_Find_Maximum {
    public static void main(String[] args) {
        /*Task 5: Find Maximum
        Title: Find max using overloaded functions
        Description:
        Create a class Utility with two methods named max():
        max(int a, int b) returns the larger of two integers
        max(int a, int b, int c) returns the larger of three integers
        max(double a, double b) returns the larger of two decimal values
        Add method calls in main() to compare different types.*/

        Utility u = new Utility();
        int max_2int= u.max(4,6);
        int max_3int = u.max(40,75,25);
        double max_d = u.max(14.25, 8.75);
        System.out.println(max_2int);
        System.out.println(max_3int);
        System.out.println(max_d);

    }
}

class Utility{
    int max(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if(b > c){
            return b;
        } else{
            return c;
        }
    }

    double max(double a, double b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
}
