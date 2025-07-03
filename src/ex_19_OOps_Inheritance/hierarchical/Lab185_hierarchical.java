package ex_19_OOps_Inheritance.hierarchical;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        Bethani r1 = new Bethani();

        r1.home();
        f1.home();

        Abir p1 = new Abir();
        p1.home();

        John l1 = new John();
        l1.l2();
        l1.home();
    }
}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Abir extends Father{
    void h2(){
        System.out.println("h2 - Abir");
    }
}

class John extends Father{

    void l2(){
        System.out.println("John");
    }
}

class Bethani extends Father {
    void r1(){
        System.out.println("bethani");
    }
}
