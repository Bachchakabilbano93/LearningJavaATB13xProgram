package JavaATB13xTasks.OOPs_Tasks.July_3rd_Polymorphism.Method_Overriding;

public class Task4_Login_Functionality {
    public static void main(String[] args) {
    /*  Task 4: Login Functionality
        Title: Different login behaviors for users
        Description:
        Create a class User with method login() that prints “User login”.
        Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
        Demonstrate calling the login() method using base class reference to highlight runtime polymorphism.*/

        User admin = new AdminUser();
        admin.login();
        User regular = new RegularUser();
        regular.login();

    }
}

class User{
    void login(){
        System.out.println("User login");
    }
}

class AdminUser extends User{
    @Override
    void login() {
        System.out.println("Admin User login");
    }
}

class RegularUser extends User{
    @Override
    void login() {
        System.out.println("Regular User login");
    }
}
