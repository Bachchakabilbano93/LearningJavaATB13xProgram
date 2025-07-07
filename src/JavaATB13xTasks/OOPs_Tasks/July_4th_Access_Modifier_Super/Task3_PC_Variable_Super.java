package JavaATB13xTasks.OOPs_Tasks.July_4th_Access_Modifier_Super;

public class Task3_PC_Variable_Super {
    public static void main(String[] args) {
//        Program 3: Access parent class variable using super
        DogKing dog = new DogKing();
        System.out.println(dog.dog_legs);
    }
}

class AnimalKingdom{
    int legs = 4;
}

class DogKing extends AnimalKingdom{
    int dog_legs = super.legs;
}