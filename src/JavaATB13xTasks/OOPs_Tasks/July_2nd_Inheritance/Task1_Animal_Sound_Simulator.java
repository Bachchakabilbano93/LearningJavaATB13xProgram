package JavaATB13xTasks.OOPs_Tasks.July_2nd_Inheritance;

public class Task1_Animal_Sound_Simulator {
    public static void main(String[] args) {
/*
         ✅ Task 1: "Animal Sound Simulator"
📄 Description:  (Single Inheritance + Method Call)
        Create a base class Animal with a method makeSound(). Then create a derived class Cat that has a method meow(). In the main method, call both methods using the Cat object.
*/
        Cat c1 = new Cat();
        c1.makeSound();
        c1.meow();

    }
}

class Animal{
    void makeSound(){
        System.out.println("Sound!!");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meow!!");
    }
}
