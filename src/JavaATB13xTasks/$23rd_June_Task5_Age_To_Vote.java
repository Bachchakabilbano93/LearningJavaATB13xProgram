package JavaATB13xTasks;

import java.util.Scanner;

public class $23rd_June_Task5_Age_To_Vote {
    public static void main(String[] args) {
//        Check if a Person is Eligible to Vote (Age Check).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You are not eligible to vote");
        }

        scanner.close();

    }
}
