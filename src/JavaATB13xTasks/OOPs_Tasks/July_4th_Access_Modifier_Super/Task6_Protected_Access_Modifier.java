package JavaATB13xTasks.OOPs_Tasks.July_4th_Access_Modifier_Super;

public class Task6_Protected_Access_Modifier {
    public static void main(String[] args) {
        /*Program 6: Demonstrate protected Access Modifier
:-  Learn how protected members behave in inheritance.
📝 Instructions:
        Create a class Animal with a protected method eat() that prints "Animal is eating".
        Create a child class Dog that extends Animal.
        Create a method doEat() in Dog class which calls eat() using inheritance.
        In main(), create a Dog object and call doEat().*/
        Dog d = new Dog();
        d.doEat();
    }
}

class Animal{
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void doEat(){
        super.eat();
    }
}
