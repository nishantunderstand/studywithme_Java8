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
    }
}