package JavaATB13xLiveTest;

public class Operator_Precedence_and_TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        float b = 3.5f;
        int exp = a*2 + (int)b;
        float sumf = a + b;
        int sumi = a + (int)b;
        System.out.printf("Expression result: %d Implicit casting: %f Explicit casting: %d", exp, sumf, sumi);

    }
}
