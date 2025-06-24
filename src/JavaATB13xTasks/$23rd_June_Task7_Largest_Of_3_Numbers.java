package JavaATB13xTasks;

import java.util.Scanner;

public class $23rd_June_Task7_Largest_Of_3_Numbers {
    public static void main(String[] args) {
//        Find the Largest of Three Numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number");
        int n2 = scanner.nextInt();
        System.out.println("Enter third number");
        int n3 = scanner.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is largest");
        } else if(n2 > n3){
            System.out.println(n2 + " is largest");
        } else{
            System.out.println(n3 + " is largest");
        }

        scanner.close();

    }
}
