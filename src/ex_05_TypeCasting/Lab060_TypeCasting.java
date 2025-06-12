package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 9075685245l;
//        short s = phone; // Implicit Narrowing not allowed
        short s1 = (short)phone; //Explicit Narrowing
        System.out.println(s1);
    }
}
