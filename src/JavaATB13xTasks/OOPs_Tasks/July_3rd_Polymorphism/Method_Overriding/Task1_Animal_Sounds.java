package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overriding;

public class Task1_Animal_Sounds {
    public static void main(String[] args) {
        /*Task 1: Animal Sounds
        Title: Override sound behavior in subclasses
        Description:
        Create a base class Animal with a method sound().
        Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
        Create an object of each class and call sound() to see how overriding provides different outputs using the same method name.*/

        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
        Cow cow = new Cow();
        cow.sound();
        Animal animal = new Dog();
        animal.sound();

    }
}

class Animal{
    void sound(){
        System.out.println("I make sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}

class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Moo");
    }
}