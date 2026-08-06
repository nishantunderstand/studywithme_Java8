package oops2_Polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

// ================= Parent =================
class Animal {

    protected Animal getAnimal() {
        System.out.println("Parent getAnimal()");
        return this;
    }

    protected void sound() throws IOException {
        System.out.println("Animal Sound");
    }

    public void eat() {
        System.out.println("Animal Eat");
    }

    final void sleep() {
        System.out.println("Animal Sleep");
    }

    private void walk() {
        System.out.println("Animal Walk");
    }

    public void callPrivateMethod() {
        walk();     // Always calls Animal.walk()
    }

    static void type() {
        System.out.println("Animal Type");
    }
}

// ================= Child =================
class Dog extends Animal {

    // Covariant Return Type
    @Override
    public Dog getAnimal() {
        System.out.println("Dog getAnimal()");
        return this;
    }

    // Increased visibility + Narrower checked exception
    @Override
    public void sound() throws FileNotFoundException {
        System.out.println("Dog Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog Eat");
    }

    // NOT overriding (Parent's walk() is private)
    public void walk() {
        System.out.println("Dog Walk");
    }

    // Method Hiding (Static)
    static void type() {
        System.out.println("Dog Type");
    }

    // Uncomment each one to see compiler errors

    /*
    // ERROR: Cannot override final method
    @Override
    void sleep() {
    }
    */

    /*
    // ERROR: Cannot reduce visibility
    @Override
    protected void eat() {
    }
    */

    /*
    // ERROR: Broader checked exception
    @Override
    public void sound() throws Exception {
    }
    */
}

// ================= Main =================
public class Main {

    public static void main(String[] args) throws Exception {

        Animal animal = new Dog();

        System.out.println("===== Runtime Polymorphism =====");
        animal.eat();      // Dog Eat
        animal.sound();    // Dog Bark

        System.out.println();

        System.out.println("===== Dynamic Method Dispatch =====");
        animal.getAnimal();

        System.out.println();

        System.out.println("===== Covariant Return Type =====");
        Animal a = animal.getAnimal();
        System.out.println(a.getClass().getSimpleName());

        System.out.println();

        System.out.println("===== Private Method =====");
        animal.callPrivateMethod();

        System.out.println();

        System.out.println("===== Child's own walk() =====");
        Dog dog = new Dog();
        dog.walk();

        System.out.println();

        System.out.println("===== Static Method Hiding =====");
        animal.type();   // Animal Type
        dog.type();      // Dog Type

        System.out.println();

        System.out.println("===== Final Method =====");
        animal.sleep();
    }
}