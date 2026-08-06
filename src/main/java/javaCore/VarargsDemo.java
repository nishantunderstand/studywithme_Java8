package javaCore;

/**
 * Created : 2026-08-05 17:32:31
 */

// ... if you write less than 3 it will get compile time error
public class VarargsDemo {
    static void print(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        print();
        print("Java");
        print("Java", "Spring", "Hibernate");
    }
}