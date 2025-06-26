package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] abir) {
        // 10 abir true

        for (int i = 0; i < abir.length; i++) {
            System.out.println(abir[i]);
        }
        System.out.println(" -- ");

        for (String arg:abir){
            System.out.println(arg);
        }
    }
}
