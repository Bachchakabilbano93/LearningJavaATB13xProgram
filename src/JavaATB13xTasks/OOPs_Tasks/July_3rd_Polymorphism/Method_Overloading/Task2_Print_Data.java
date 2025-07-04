package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overloading;

public class Task2_Print_Data {
    public static void main(String[] args) {
        /*Task 2: Print Data
        Title: Create a universal printer with overloading
        Description:
        Create a class Printer with multiple printData() methods to handle different data types:
        printData(String data)
        printData(int data)
        printData(float data)
        Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.*/

        Printer p = new Printer();
        p.printData("Abir");
        p.printData(786);
        p.printData(23.5f);
    }
}

class Printer{
    void printData(String s){
        System.out.println(s);
    }

    void printData(int i){
        System.out.println(i);
    }

    void printData(float f){
        System.out.println(f);
    }
}
