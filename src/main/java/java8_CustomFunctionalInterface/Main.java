package java8_CustomFunctionalInterface;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== Tuesday, August 18, 2026 8:53:53 PM ======\n");
        Calculator addition = (a, b) -> a + b;
        System.out.println(addition.calculate(10, 20));

    }
}
