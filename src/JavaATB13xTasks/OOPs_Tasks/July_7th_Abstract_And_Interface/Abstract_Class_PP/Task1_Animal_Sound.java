package JavaATB13xTasks.OOPs_Tasks.July_7th_Abstract_And_Interface.Abstract_Class_PP;

public class Task1_Animal_Sound {
    public static void main(String[] args) {
        /*1. Animal Sound - Abstract Method Implementation
        Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
🔶 Expected Output:
        Dog barks
        Cat meows*/

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();

    }
}

abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
