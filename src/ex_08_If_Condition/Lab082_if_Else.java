package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age >= 18 -> allowed to vote.
        // else age < 18 -> Not allowed to vote.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("Not allowed to vote!");
        }else{
            System.out.println("Allowed to vote");
        }

    }
}
