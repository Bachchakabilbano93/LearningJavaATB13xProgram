package ex_10_For_Loop;

public class Lab112_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++){ // 0 to 50, 51 times
            if(i%2==0){
                continue;
            }
            System.out.println("Odd ->" + i);
        }
    }
}
