package JavaATB13xTasks;

import java.util.Scanner;

public class $24th_June_Task7_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        /*ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
        Steps to Write the Program
        1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
        2️⃣ Take user input for the amount they want to withdraw.
        3️⃣ Check withdrawal conditions:
        The amount should be greater than zero.
        The amount should be a multiple of 100 (common ATM rule).
        The amount should not exceed the account balance.
        4️⃣ Deduct the amount from the balance if conditions are met.
        5️⃣ Display the updated balance or an error message if the withdrawal fails.*/

        int account_balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        int withdraw_amount = scanner.nextInt();
        while(withdraw_amount > 0) {
            if (withdraw_amount % 100 != 0) {
                System.out.println("Enter the amount in multiple of 100");
                withdraw_amount = scanner.nextInt();
                continue;
            } else if (withdraw_amount < account_balance) {
                account_balance = account_balance - withdraw_amount;
                System.out.println("Your remaining account balance is: " + account_balance);
                break;
            } else {
                System.out.println("Your account balance is too low");
                break;
            }

        }


    }
}
