    package JavaATB13xTasks;

    import java.util.Scanner;

    public class $25th_June_Task7_Travel_Visa_Eligibility {
        public static void main(String[] args) {
            /*Find if a Person Can Travel Based on Visa Status and Age.
            take the input from the user for
            Age (integer).
                    Visa Status (String or boolean).
            Check Eligibility:
                 :- If age is 18 or older and visa status is valid, the person can travel.
                    Otherwise, the person cannot travel.
                    Validation Criteria
            Age: - Must be a non-negative integer.
                             :- Should be greater than or equal to 18 to be eligible to travel.
                    Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
                                   :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.*/

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            System.out.println("What is your current Visa Status");
            boolean is_visa_valid = scanner.nextBoolean();

            if(age < 0) {
                System.out.println("Enter valid age");
            }

            while(age > 0){
                if(age >= 18 && is_visa_valid){
                    System.out.println("You can travel");
                    break;
                } else{
                    System.out.println("You cannot travel");
                    break;
                }
            }

            scanner.close();
        }
    }
