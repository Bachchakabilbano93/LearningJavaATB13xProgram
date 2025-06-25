package JavaATB13xTasks;

import java.util.Scanner;

public class $24th_June_Task4_Grade_Calculator {
    public static void main(String[] args) {
/*        Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)

        1️⃣ Take user input for marks (Use Scanner class).
        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
        3️⃣ Use if-else-if conditions to determine the grade based on marks.
        4️⃣ Display the grade as output.

📌 Grading Criteria (Example)

        Marks Range Grade

        90 - 100   A+

        80 - 89     A

        70 - 79      B

        60 - 69     C

        50 - 59      D

        40 - 49      E

        Below 40   Fail*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerical score: ");
        int score = scanner.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println(score + ": Grade is A+");
        } else if (score >= 80 && score <= 89) {
            System.out.println(score + ": Grade is A");
        } else if (score >= 70 && score <= 79) {
            System.out.println(score + ": Grade is B");
        } else if (score >= 60 && score <= 69) {
            System.out.println(score + ": Grade is C");
        } else if (score >= 50 && score <= 59) {
            System.out.println(score + ": Grade is D");
        } else if (score >= 40 && score <= 49) {
            System.out.println(score + ": Grade is E");
        } else if (score >= 0 && score < 40){
            System.out.println("You have failed");
        } else {
            System.out.println("Invalid Score: Enter a score between 0 and 100");
        }

        scanner.close();

    }
}
