package JavaATB13xLiveTest;

public class Comparison_and_Logical_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean result1 = a==b;
        boolean result2 = a > b;
        boolean result3 = a < b;
        boolean result4 = (a > b) && (a > 0);
        boolean result5 = (a > b) || (a < 0);
        boolean result6 = !(a > b);

        System.out.println("a==b: " + result1 + " a > b: " + result2 + " a < b: " + result3 + " (a > b) && (a > 0): " + result4 + " (a > b) || (a < 0): " + result5 + " !(a > b): " + result6);

    }
}
