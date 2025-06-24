    package JavaATB13xTasks;

    import java.util.Scanner;

    public class $23rd_June_Task2_Even_Odd_Check {
        public static void main(String[] args) {
    //        Check if a Number is Even or Odd.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            if(number%2 == 0){
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }

            scanner.close();

        }
    }
