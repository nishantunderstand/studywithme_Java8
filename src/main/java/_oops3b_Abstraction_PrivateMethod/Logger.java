package _oops3b_Abstraction_PrivateMethod;

public interface Logger {
    default void info(){
        System.out.println("Info.....");
        log();
    }

    default void report(){
        System.out.println("Report.....");
        log();
    }

    private void log(){
        System.out.println("Logging ......");
    }
}
