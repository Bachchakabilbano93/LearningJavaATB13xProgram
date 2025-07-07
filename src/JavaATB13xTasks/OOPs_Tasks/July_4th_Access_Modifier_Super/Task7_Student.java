package JavaATB13xTasks.OOPs_Tasks.July_4th_Access_Modifier_Super;

public class Task7_Student {
    public void showInfo(){
        System.out.println("Public Access: Student Info");
    }
}

class subStudent {
    public static void main(String[] args) {
        Task7_Student s = new Task7_Student();
        s.showInfo();
    }
}
