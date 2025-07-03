package JavaATB13xTasks.OOPs_Tasks.July_1st_Constructor;

class Main2 {
    public static void main(String[] args) {
//        Program 2: How do you create a parameterized constructor? Give one example, Write a code for that.
        Student2 s = new Student2("John", 20);
        System.out.println("Name: " + s.name + ", Age: " + s.age);

    }
}

class Student2 {

    String name;
    int age;

    // Parameterized constructor
    Student2(String n, int a) {
        this.name = n;
        this.age = a;

    }
}
