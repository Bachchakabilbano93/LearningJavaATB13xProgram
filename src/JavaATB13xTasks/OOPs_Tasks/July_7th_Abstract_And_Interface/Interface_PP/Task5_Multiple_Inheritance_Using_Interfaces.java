package JavaATB13xTasks.OOPs_Tasks.July_7th_Abstract_And_Interface.Interface_PP;

public class Task5_Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {
        /*6. Multiple Inheritance Using Interfaces(Numbering is wrong in Task Post of 7th July)
🔶 Objective:
Show how a class in Java can implement multiple interfaces to achieve multiple inheritance.
🔶 Steps:
Create two interfaces: Printable and Showable.
Each interface should have a method: print() and show() respectively.
Create a class Document that implements both interfaces.
Implement both methods in the Document class.
In the main() method, create a Document object and call both methods.
🔶 Expected Output:
Printing Document
Showing Document*/

        Document document = new Document();
        document.print();
        document.show();
    }
}

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Document implements Printable, Showable{

    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    @Override
    public void show() {
        System.out.println("Showing Document");
    }
}