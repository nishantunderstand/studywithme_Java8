package jcf_ConcurrentModification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainNew {
    public static void main(String[] args) {

        System.out.println("====== Friday, August 28, 2026 12:36:58 AM ======");
        List<Integer> a2 = new ArrayList<>();
        a2.add(10);
        a2.add(11);
        a2.add(12);
        Iterator<Integer> itr = a2.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            // You are removing As you are processing it
            //if(i==10) a2.remove(i); // Incorrect way of removing
            //if(i==11) a2.remove(i);
            //if(i==12) a2.remove(i);

            // You are removing by using iterator.
            if(i==10) itr.remove();
        }
        System.out.println(a2);
    }
}
