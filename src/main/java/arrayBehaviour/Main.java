package arrayBehaviour;

/**
 * Created : 2026-08-09 12:25:47
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]); // Crash when i = 3
        }
    }
}