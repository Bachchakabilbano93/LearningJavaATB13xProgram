package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overriding;

public class Task3_Employee_Role_Info {
    public static void main(String[] args) {
        /*Task 3: Employee Role Info
        Title: Show employee roles with overridden methods
        Description:
        Create a class Employee with method role() printing “General Employee”.
        Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
        Call role() on each object to show how overriding helps in specialization.*/

        Manager manager = new Manager();
        manager.role();
        Clerk clerk = new Clerk();
        clerk.role();
        Tester tester = new Tester();
        tester.role();

    }
}

class Employee{
    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{
    @Override
    void role() {
        System.out.println("Manager");
    }
}

class Clerk extends Employee{
    @Override
    void role() {
        System.out.println("Clerk");
    }
}

class Tester extends Employee{
    @Override
    void role() {
        System.out.println("Tester");
    }
}