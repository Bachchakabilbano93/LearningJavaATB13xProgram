package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overloading;

public class Task4_Greet_User {
    public static void main(String[] args) {
        /*Task 4: Greet User
        Title: Greet users differently using overloading
        Description:
        Create a class Greeter with the following methods:
        greet() – prints "Hello!"
        greet(String name) – prints "Hello, [name]!"
        This task teaches overloading based on the number of parameters.*/

        Greeter g = new Greeter();
        g.greet();
        g.greet("Abir");

    }
}

class Greeter{
    void greet(){
        System.out.println("Hello");
    }

    void greet(String name){
        System.out.println("Hello, [" + name + "]!");
    }
}
