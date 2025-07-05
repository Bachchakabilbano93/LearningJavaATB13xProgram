package ex_22_OOPs_accessModifier;

public class Lab192_Java {

}

class Father{
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}

class Son extends Father{
    void weCanuse(){
//        System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}
