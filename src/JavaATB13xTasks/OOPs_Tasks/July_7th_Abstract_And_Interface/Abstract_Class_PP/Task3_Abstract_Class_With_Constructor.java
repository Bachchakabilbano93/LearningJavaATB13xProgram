package JavaATB13xTasks.OOPs_Tasks.July_7th_Abstract_And_Interface.Abstract_Class_PP;

public class Task3_Abstract_Class_With_Constructor extends printMessage{
    public static void main(String[] args) {
/*        4. Abstract Class with Constructor(Numbering is wrong in Task Post of 7th July)
        Description: Show that abstract class can have constructor. Print message from constructor and method.
🔶Expected Output:
        Abstract class constructor called
        Method from abstract class*/

        Task3_Abstract_Class_With_Constructor t3 = new Task3_Abstract_Class_With_Constructor();
        t3.method();

    }
}

abstract class printMessage{
    printMessage() {
        System.out.println("Abstract class constructor called");
    }

    void method(){
        System.out.println("Method from abstract class");
    }
}
