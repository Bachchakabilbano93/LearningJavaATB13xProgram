package ex_22_OOPs_accessModifier.criminal;

import ex_22_OOPs_accessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
//        thief.canIShoot();
//        thief.thisDefaultF1();
    }
}
