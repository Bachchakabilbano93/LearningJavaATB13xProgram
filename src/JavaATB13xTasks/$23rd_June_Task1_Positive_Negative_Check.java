    package JavaATB13xTasks;

    import java.util.Scanner;

    public class $23rd_June_Task1_Positive_Negative_Check {
        public static void main(String[] args) {
    //        Check if a Number is Positive or Negative.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            if (number > 0){
                System.out.println(number + " is a positive integer");
            }else if(number < 0){
                System.out.println(number + " is a negative integer");
            } else if (number == 0){
                System.out.println(number + " is a neutral integer");
            }

            scanner.close();

        }
    }
