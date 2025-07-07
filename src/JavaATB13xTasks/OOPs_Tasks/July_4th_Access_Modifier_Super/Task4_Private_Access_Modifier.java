package JavaATB13xTasks.OOPs_Tasks.July_4th_Access_Modifier_Super;

public class Task4_Private_Access_Modifier {
    public static void main(String[] args) {
//        Program 4: Create a Program to Access the private access modifier
        Father father = new Father();
        System.out.println(father.getGold());
    }
}

class Father{

    private int gold = 10;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
