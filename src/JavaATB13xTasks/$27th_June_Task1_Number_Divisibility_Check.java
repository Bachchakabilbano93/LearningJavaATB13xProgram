package JavaATB13xTasks;

import java.util.Scanner;

public class $27th_June_Task1_Number_Divisibility_Check {
    public static void main(String[] args) {
//        Check if a Number is Divisible by 5 and 11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if(num % 5 == 0 && num % 11 == 0){
            System.out.println(num + " is divisible by both 5 and 11");
        }else{
            System.out.println(num + " is not divisible by both 5 and 11");
        }
        scanner.close();
    }
}
