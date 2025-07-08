package JavaATB13xTasks.OOPs_Tasks.July_7th_Abstract_And_Interface.Interface_PP;

public class Task6_Interface_Default_Static_Methods {
    public static void main(String[] args) {
        /*Interface with Default and Static Method(Numbering is wrong in Task Post of 7th July)
🔶 Objective:
Learn how to use default and static methods in interfaces (since Java 8).
🔶 Steps:
Create an interface Vehicle.
Add a default method start() that prints "Vehicle started".
Add a static method fuelType() that prints "Fuel type is Petrol".
Create a class Car that implements Vehicle.
In main(), create a Car object and call start().
Call Vehicle.fuelType() without creating an object.
🔶 Expected Output:
Vehicle started
Fuel type is Petrol*/

        Car car = new Car();
        car.start();
        Vehicle.fuelType();

    }
}

interface Vehicle{
    default void start(){
        System.out.println("Vehicle started");
    }

    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle{

}
