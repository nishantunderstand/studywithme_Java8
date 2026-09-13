package __jcf_Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorPratice2 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(9, 8, 7, 6, 5, 4, 11); // UnModifiable List
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
