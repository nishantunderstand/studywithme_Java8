package oops3_Abstraction;

public interface Vechile {

    default void start(){
        System.out.println("Vechile Started");
    }
}
