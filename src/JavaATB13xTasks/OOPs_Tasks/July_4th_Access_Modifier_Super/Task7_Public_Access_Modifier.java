package JavaATB13xTasks.OOPs_Tasks.July_4th_Access_Modifier_Super;

public class Task7_Public_Access_Modifier {
    public static void main(String[] args) {
        /*Program 7: Demonstrate public Access Modifier
:- Understand how public methods are accessible from anywhere.
📝 Instructions:
        Create a class Student with a public method showInfo() that prints "Public Access: Student Info".
        In the main() method, create an object of Student.
        Call showInfo() directly from anywhere like same class, sub class, different class same package, in different package it should work without restriction.*/
        Task7_Student student = new Task7_Student();
        student.showInfo();
    }
}
