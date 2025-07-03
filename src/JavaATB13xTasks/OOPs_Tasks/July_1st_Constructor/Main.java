package JavaATB13xTasks.OOPs_Tasks.July_1st_Constructor;

class Main {
    public static void main(String[] args) {
//        Program 1: What is a default constructor? Give one example, Write a code for that.

        Student s = new Student();
        System.out.println("Name: " + s.name + ", Age: " + s.age);

    }
}

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

}
