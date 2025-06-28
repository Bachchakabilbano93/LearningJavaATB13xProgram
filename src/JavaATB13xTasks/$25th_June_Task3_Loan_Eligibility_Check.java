    package JavaATB13xTasks;

    import java.util.Scanner;

    public class $25th_June_Task3_Loan_Eligibility_Check {
        public static void main(String[] args) {
                /*Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
            * Take the below User info and store it into the variables:
                Age (integer)
                Salary (double or float)
                Credit Score (integer)
                Age Validation:
                      :- Check if the age is a positive integer.
                      :- Ensure the age is at least 18 years old.
                      :- Max age can be 80.
                Salary Validation:
                     :- Check if the salary is a positive number.
                     :- Define a minimum salary threshold (e.g., 30,000).
                Credit Score Validation:
                     :- Check if the credit score is a positive integer.
                     :- Define a minimum credit score threshold (e.g., 650).
                     :- Max credit score threshold (e.g., 850).*/

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            System.out.println("Enter your salary");
            double salary = scanner.nextDouble();
            System.out.println("Enter your Credit Score");
            int creditScore = scanner.nextInt();

            if (age >= 18 && age <= 80){
                if(salary > 0 && salary >= 30000){
                    if (creditScore >= 650 && creditScore <= 850){
                        System.out.println("You are eligible for Loan");
                    } else{
                        System.out.println("You are not eligible for loan");

                    }
                } else{
                    System.out.println("You are not eligible for loan");
                }
            }else {
                System.out.println("You are not eligible for loan");
            }

        }
    }
