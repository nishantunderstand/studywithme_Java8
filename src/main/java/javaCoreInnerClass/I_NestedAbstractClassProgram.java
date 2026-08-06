package javaCoreInnerClass;

/**
 * Created : 2026-08-05 19:40:00
 *
 * Topic : Nested Abstract Class
 *
 * Interview Questions
 * -------------------
 * Q1. Can an abstract class be nested?
 * Q2. Can a class be both static and abstract?
 * Q3. How do you create an object of a nested abstract class?
 */
public class I_NestedAbstractClassProgram {

    static abstract class Animal {

        Animal() {
            System.out.println("Animal Constructor");
        }

        abstract void sound();

        void sleep() {
            System.out.println("Animal is Sleeping...");
        }
    }

    static class Dog extends Animal {

        @Override
        void sound() {
            System.out.println("Dog is Barking...");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
        animal.sleep();
    }
}