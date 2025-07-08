package JavaATB13xTasks.OOPs_Tasks.July_7th_Abstract_And_Interface.Abstract_Class_PP;

public class Task2_Bank_Interest_Calculation {
    public static void main(String[] args) {
        /*2. Bank Interest Calculation
        Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.
🔶 Expected Output:
        SBI Interest Rate: 6.5%
        HDFC Interest Rate: 7.0%*/

        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        sbi.getInterestRate();
        hdfc.getInterestRate();
    }
}

abstract class Bank{
    abstract void getInterestRate();
}

class SBI extends Bank{

    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank{

    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}