package ex_18_OOPs_Constructor;

public class Lab177_PC {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);

        BabyA b3  = new BabyA("deepti","12345678",2024,02,12);
        BabyA b4  = new BabyA("kavya","56789101",2025,01,01);
        System.out.println(b3.name);
        System.out.println(b4.name);

    }

}

class BabyA{

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    // DC
    BabyA(){
        name = "Gugu";
        aadhar_number = "1234";
        year = 1971;
        month = 01;
        day = 01;

    }

    BabyA(String name_user,String aadhar_number_user,int year_user, int month_user,int day_user){
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
    }
}
