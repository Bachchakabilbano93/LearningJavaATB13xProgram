package JavaATB13xTasks.OOPs_Tasks.July_7th_Abstract_And_Interface.Interface_PP;

public class Task7_Interface_Constants {
    public static void main(String[] args) {
        /*8. Interface Constants(Numbering is wrong in Task Post of 7th July)
🔶 Objective:
Demonstrate how to use constants (public static final variables) in interfaces.
🔶 Steps:
Create an interface SpeedLimit with a constant MAX_SPEED = 120.
In a class Car, access and print the constant.
Do not modify the constant—it should behave like a final value.
🔶 Expected Output:
Max Speed is: 120*/

        Car2 car2 = new Car2();
        car2.print();
    }
}

interface SpeedLimit{
    public static final int MAX_SPEED = 120;
}

class Car2 implements SpeedLimit{
    void print(){
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}
