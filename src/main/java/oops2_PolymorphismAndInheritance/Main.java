package oops2_PolymorphismAndInheritance;

class Parent {

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    // 1️⃣ METHOD OVERRIDING
    @Override
    void show() {
        System.out.println("Child");
    }
}

public class Main {

    public static void main(String[] args) {

        // Reference Type → Parent
        // Actual Object  → Child

        Parent obj = new Child();
        // 2️⃣ DYNAMIC METHOD DISPATCH
        obj.show();

        // 1. How to call Parent show ??
        // 2. How to child Show ??

        // From Main Class
        // Can i call Parent Show Method ? Is it Possible or not ?
            // Not Directly
            // You need to use super.show in implementing class to achieve it.
        // Can i call child one
            // Create Object of child Class
            // Create Reference of Parent and Object and Child || Runtime Polymoriphism aka Dymanic Method Dispatch
    }
}