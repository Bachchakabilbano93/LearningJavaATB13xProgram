package JavaATB13xTasks.OOPs_Tasks.July_4th_Access_Modifier_Super;

public class Task2_PC_Method_Super {
    public static void main(String[] args) {
//        Program 2: Access parent class method using super
        Car car = new Car();
        car.start();
    }
}

class Vehicle{
    void start(){
        System.out.println("Starts the vehicle");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        super.start();
    }
}