package _oops1;

public class Main {
    public static void main(String[] args) {
        // Animal a1 = new Animal(); // Abstract Class
        Dog d1 = new Dog();
        d1.sleep();
        d1.eat();

        System.out.println("====== Monday, August 3, 2026 9:16:13 PM ======\n");
        Animal ad = new Dog();
        ad.sleep(); // Runtime Polymorphism ????
        ad.sleep();
    }
}
