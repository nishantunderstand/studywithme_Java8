package javaCoreInnerClass;

/**
 * Created : 2026-08-05 18:55:00
 *
 * Topic : Anonymous Inner Class
 *
 * Interview Questions
 * -------------------
 * Q1. What is an Anonymous Inner Class?
 * Q2. Why is it called Anonymous?
 * Q3. When should we use it?
 * Q4. How is it different from Lambda?
 */
public class D_AnonymousInnerClassProgram {
    interface Animal {
        void sound();
    }

    public static void main(String[] args) {
        // Anonymous Inner Class
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dog is Barking...");
            }
        };
        dog.sound();
    }
}