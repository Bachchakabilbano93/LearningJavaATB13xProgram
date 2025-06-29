package JavaATB13xTasks;

import java.util.Scanner;

public class $27th_June_Task4_Senior_Citizen_Check {
    public static void main(String[] args) {
        /*Find if a Person is Senior Citizen Based on Age.
         :- take the age input from the user.
        Implement Age Category Logic:
        Define the criteria for different age categories:
        Child: Age 0 to 12
        Teenager: Age 13 to 19
        Adult: Age 20 to 64
        Senior Citizen: Age 65 and older*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age < 0){
            System.out.println("Please enter a valid age");
        } else if(age >= 0 && age <= 12){
            System.out.println("You are a Child");
        } else if(age > 12 && age <= 19){
            System.out.println("You are a Teenager");
        } else if (age > 19 && age <= 64){
            System.out.println("You are an Adult");
        } else{
            System.out.println("You are a Senior Citizen");
        }

        scanner.close();
    }
}
