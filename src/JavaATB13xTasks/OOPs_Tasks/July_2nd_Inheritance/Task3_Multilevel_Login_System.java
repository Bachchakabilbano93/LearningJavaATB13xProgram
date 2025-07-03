package JavaATB13xTasks.OOPs_Tasks.July_2nd_Inheritance;

public class Task3_Multilevel_Login_System {
    public static void main(String[] args) {
    /*
        ✅ Task 3: "Multilevel Login System"
📄 Description: (Multilevel Inheritance)
        Create a class User with a method login().
        Extend it with a class AdminUser that adds a method accessAdminPanel().
        Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().
        Use an object of SuperAdmin to call all three methods.
        */

        SuperAdmin s1 = new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutdownSystem();

    }
}

class User{

    void login() {
        System.out.println("You are logged in successfully");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Access Granted!!");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("Shutting down...");
    }
}
