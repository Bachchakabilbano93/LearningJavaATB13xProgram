package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overriding;

public class Task2_Vehicle_Start {
    public static void main(String[] args) {
        /*Task 2: Vehicle Start
        Title: Demonstrate engine start behavior using overriding
        Description:
        Create a base class Vehicle with a method start().
        Create Bike and Car classes that override the start() method:
        Bike prints "Kick start the bike"
        Car prints "Turn the key to start the car"
        This shows how polymorphism works with method overriding.*/

        Bike bike = new Bike();
        bike.start();
        Car car = new Car();
        car.start();

    }
}

class Vehicle{
    void start(){
        System.out.println("Starts the Vehicle");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Turn the key to start the car");
    }
}