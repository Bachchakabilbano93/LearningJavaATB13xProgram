package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab184_Multi_LEVEL {
    public static void main(String[] args) {
//        Son s1 = new Father();
//        Son s1 = new GrandFather();

        Son abir = new Son();
        System.out.println(abir.gold_gf);
        abir.gf();

        GrandFather grandFather = new Son();
        grandFather.home();

    }
}
