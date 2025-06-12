package JavaATB13xTasks;

public class $12th_June_Task_TO_TC {
    public static void main(String[] args) {
//        1 Ternary Operator Programs
//        Program 1: Find Max of Two Numbers using Ternary Operators.
//        Description: Uses ternary operator to compare a and b and print the maximum value.A =10, B= 20;
        int A = 10;
        int B = 20;

        int max = A > B ? A : B;
        System.out.println(max);

//        Program 2: Check Even or Odd.
//        Description: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;
        int A1 = 19;
        String result = (A1%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        int A2 = 20;
        String result1 = (A2%2 == 0) ? "Even" : "Odd";
        System.out.println(result1);

//        Program 3: Grade Calculation Using Nested Ternary
//        Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        int marks = 85;
//        90 = A+;
//        75 = A;
//        60 = B;
//        40 = C;
//        <40 = Fail;
        String result2 = (marks < 40) ? "Fail" : (marks < 60) ? "C" : (marks < 75) ? "B" : (marks < 90) ? "A" : "A+";
        System.out.println(result2);

//        2 Typecasting Programs
//        Program 4: Implicit Typecasting (Widening)
//        Description: Convert int A =100 to double.
        int a = 100;
        double d = a;
        System.out.println(d);

//        Program 5: Explicit Typecasting (Narrowing)
//        Description: Casts a double to an int, cutting off decimals value.
        double f = 98.4;
        int c = (int)f;
        System.out.println(c);

//         Program 6: Character to ASCII
//        Description: Typecasts a character to its ASCII integer value. Example Print A ASCII Int value.
        char b = 'A';
        int e = b; // Implicit
        int z = (int)b; // Explicit
        System.out.println(e);
        System.out.println(z);

//        Program 7: Typecasting in Division
//        Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.
        int a1 = 10;
        int b1 = 3;
        float c1 = (float)a1/(float)b1;
        System.out.println(c1);

    }
}
