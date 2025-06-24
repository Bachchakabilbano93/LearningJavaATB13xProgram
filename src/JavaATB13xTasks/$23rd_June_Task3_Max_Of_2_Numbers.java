package JavaATB13xTasks;

import java.util.Scanner;

public class $23rd_June_Task3_Max_Of_2_Numbers {
    public static void main(String[] args) {
//        Find the Maximum of Two Numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();
        if(n1 == n2) {
            System.out.println("Both numbers are equal");
        }else if(n1 > n2){
            System.out.println("Max: " + n1);
        } else {
            System.out.println("Max: " + n2);
        }

        scanner.close();

    }
}
