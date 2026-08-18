package oops3d_Interface_PrivateStaticMethod;

public interface Logger {
    static void info(){
        System.out.println("Static.....");
        print();
    }

    private static void print(){
        System.out.println("Private Static Method....");
    }
}
