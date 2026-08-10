package _arrayBehaviour;

/**
 * Created : 2026-08-09 12:26:23
 */
public class MainCircular {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        for (int i = 0; i < 6; i++) {
            System.out.println(
                    "i = " + i +
                            ", i % n = " + (i % n) +
                            ", value = " + arr[i % n]
            );
        }
    }
}