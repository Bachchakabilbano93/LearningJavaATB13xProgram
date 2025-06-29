package JavaATB13xTasks;

import java.util.Scanner;

public class $25th_June_Task5_Bonus_Calculation {
    public static void main(String[] args) {
        /*Calculate Bonus Based on Salary and Years of Experience.
         :- take the salary and Year info from the User.
        Implement Bonus Calculation Logic:
        Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: Rs ");
        double salary = scanner.nextDouble();
        System.out.println("Enter your Years of Experience: ");
        double yoe = scanner.nextDouble();
        double bonus = calculateBonus(salary, yoe);
        System.out.println("Your bonus is: Rs " + bonus);
        scanner.close();

    }

    static double calculateBonus(double salary, double yoe) {
        double bonus = 0;
        if(yoe < 1){
            bonus = 0;
        } else if(yoe >= 1 && yoe <=3){
            bonus = bonus + salary * (5.0 / 100);
        } else if (yoe >= 4 && yoe <= 6){
            bonus = bonus + salary * (10.0 / 100);
        } else if (yoe > 6){
            bonus = bonus + salary * (15.0 / 100);
        }
        return bonus;
    }
}
