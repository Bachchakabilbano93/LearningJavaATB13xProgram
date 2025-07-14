package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous
        List mylist2 = new LinkedList(); // Doubly Linked List.

        mylist2.add("Abir");
        mylist2.add("Bhattacharya");
        mylist2.add("Amit");
        mylist2.add("alice");
        mylist2.add("rajesh");
        mylist2.add("rajesh");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Bhattacharya"));
        System.out.println(mylist2.indexOf("Bhattacharya"));
        System.out.println(mylist2.get(0));

        System.out.println(" --- ");

        Iterator iterator =  mylist2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
