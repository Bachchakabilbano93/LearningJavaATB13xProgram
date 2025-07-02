package ex_18_OOPs_Constructor;

public class Lab179_PC_Constructor_Overloading {
    public static void main(String[] args) {
        Person1 p1 = new Person1("ABIR",89812852,"abc");
        Person1 p2 = new Person1("JOHN",74858907,"XYZ");

        Person1 p3  = new Person1();
        p3.name = "Nisha";
        System.out.println(p3.name);

        Person1 p4 = new Person1("JACK",12345678);
        System.out.println(p4.address);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}

class Person1{

    String name;
    long phone;
    String address;

    Person1(){

    }

    Person1(String name_arg,long phone_arg, String address_arg){
        this.name = name_arg;
        this.address = address_arg;
        this.phone = phone_arg;

    }

    Person1(String name_arg,long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;

    }

    void eat(){
        System.out.println(this.name + " is eating!");
    }
}
