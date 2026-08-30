package _jcf_ConcurrentModification;

import java.util.ArrayList;
import java.util.List;

/**
 * To Test ConcurrentModification Exception
 * FailFast
 * FailSafe
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("====== Friday, August 28, 2026 12:17:06 AM ======");
        ArrayList<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        a2.add(10);
        a2.add(11);
        //a2.add(12);

        for(Integer i : a2){
            if(i==10) a2.remove(i); // Exception
            //if(i==11) a2.remove(i); // But Why ??
            if(i==12) a2.remove(i);
            System.out.println(i);
        }
    }
}

// for i=11 Exception, i=12 No Exception Why ??
// It behaviour is UnPredictable , Sometime is it is throwing sometime it is not ??