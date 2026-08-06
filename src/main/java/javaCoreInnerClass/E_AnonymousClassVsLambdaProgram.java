package javaCoreInnerClass;

/**
 * Created : 2026-08-05 19:00:00
 *
 * Topic : Anonymous Class vs Lambda Expression
 *
 * Interview Questions
 * -------------------
 * Q1. Difference between Anonymous Class and Lambda?
 * Q2. What does "this" refer to in both cases?
 * Q3. Why can Lambda be used only with Functional Interfaces?
 */

public class E_AnonymousClassVsLambdaProgram {
    @FunctionalInterface
    interface Animal {
        void sound();
    }
    private String name = "Outer Class";

    void anonymousDemo() {
        Animal animal = new Animal() {
            private String name = "Anonymous Class";
            @Override
            public void sound() {
                System.out.println("Anonymous Class");
                System.out.println("this.name = " + this.name);
                System.out.println("Outer name = " + E_AnonymousClassVsLambdaProgram.this.name);
            }
        };

        animal.sound();
    }

    void lambdaDemo() {
        Animal animal = () -> {
            System.out.println("\nLambda");
            // "this" refers to the OUTER class object
            System.out.println("this.name = " + this.name);
        };

        animal.sound();
    }

    public static void main(String[] args) {
        E_AnonymousClassVsLambdaProgram obj = new E_AnonymousClassVsLambdaProgram();
        obj.anonymousDemo();
        obj.lambdaDemo();
    }
}