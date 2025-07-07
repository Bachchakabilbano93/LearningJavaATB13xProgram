package JavaATB13xTasks.OOPs_Tasks.July_4th_Access_Modifier_Super;

public class Task1_PC_Con_Super {
    public static void main(String[] args) {
//        Program 1: Access parent class constructor using super()
        Child child = new Child();
    }
}

class Parent{
    Parent(){
        System.out.println("This is parent");
    }
}

class Child extends Parent{
    Child(){
        super();
    }
}