package JavaATB13xLiveTest;

import java.util.Scanner;

public class Number_Classification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int i = scanner.nextInt();
        if(i > 0){
            System.out.println(i + " is positive");
        } else if (i < 0) {
            System.out.println(i + " is negative");
        } else if (i == 0) {
            System.out.println(i + " is zero");
        }

        scanner.close();
    }
}
