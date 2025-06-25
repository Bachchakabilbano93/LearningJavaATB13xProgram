package JavaATB13xTasks;

import java.util.Scanner;

public class $24th_June_Task6_Prime_Number_Check {
    public static void main(String[] args) {
//        Check if a Number is Prime
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = scanner.nextInt();
        if (i <= 1) {
            System.out.println(i + " is not a prime number");
        } else if (i == 2) {
            System.out.println(i + " is a prime number");
        } else if (i % 2 == 0) {
            System.out.println(i + " is not a prime number");
        } else {
            boolean isPrime = true;
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }
        }


    }
}
