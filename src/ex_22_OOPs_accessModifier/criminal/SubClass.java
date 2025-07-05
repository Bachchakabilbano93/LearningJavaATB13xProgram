package ex_22_OOPs_accessModifier.criminal;

import ex_22_OOPs_accessModifier.police.Cop;

public class SubClass extends Cop {

    public SubClass(int bullet){
        super(bullet);
    }

    public static void main(String[] args) {
//        new SubClass().thisDefaultF1();
//        new SubClass(10).canIShoot();
    }
}
