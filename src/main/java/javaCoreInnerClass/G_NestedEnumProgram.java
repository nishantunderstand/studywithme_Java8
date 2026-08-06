package javaCoreInnerClass;

/**
 * Created : 2026-08-05 19:20:00
 *
 * Topic : Nested Enum
 *
 * Interview Questions
 * -------------------
 * Q1. Can an enum be declared inside a class?
 * Q2. How do you access a nested enum?
 * Q3. Is a nested enum static?
 */
public class G_NestedEnumProgram {

    enum Status {

        ACTIVE,
        INACTIVE,
        PENDING
    }

    public static void main(String[] args) {

        Status status = Status.ACTIVE;

        System.out.println("Current Status : " + status);

        for (Status value : Status.values()) {
            System.out.println(value);
        }
    }
}