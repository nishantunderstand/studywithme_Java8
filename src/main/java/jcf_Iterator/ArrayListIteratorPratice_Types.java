package jcf_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListIteratorPratice_Types {
    public static void main(String[] args) {
        //List<Integer> al = new ArrayList<>(); al.add(1); al.add(2); al.add(6);al.add(11);
        List<Integer> al1 = Arrays.asList(9, 8, 7, 6, 5, 4, 11); // UnModifiable List
        List<Integer> al2 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 11)); // Modifiable List
        List<Integer> al = new CopyOnWriteArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 11));

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            Integer value = itr.next();
            if (value == 6) {
                itr.remove();
            }
            System.out.println(value);
        }
    }
}
