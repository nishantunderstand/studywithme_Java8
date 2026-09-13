package __jcf_Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorPratice {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(9, 8, 7, 6, 5, 4, 11);
        List<Integer> al2 = Arrays.asList(1, 2, 3, 4, 5);


//        for(Integer itr : al){
//            System.out.println(itr);
//        }

//        al.stream().forEach(System.out::println);


//        // Incorrect Code
//        Iterator<Integer> itr = al.iterator();
//        while(itr.hasNext()){
//            if(itr.next()==6){
//                itr.remove();
//            }
//            System.out.println(itr.next());
//        }

        // One next() = one iterator movement.

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
