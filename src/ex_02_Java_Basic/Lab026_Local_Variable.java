package ex_02_Java_Basic;

public class Lab026_Local_Variable {

    int i; //Instance Variable
    static int j; //Static Variable

    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
        }
        int b = 90;
        System.out.println(b);
    }
}
