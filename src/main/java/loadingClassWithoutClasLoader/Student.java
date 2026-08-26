package loadingClassWithoutClasLoader;

public class Student {

    static {
        System.out.println("1. Static block: Class initialized");
    }

    {
        System.out.println("2. Instance block executed");
    }

    public Student() {
        System.out.println("3. Constructor executed");
    }

    public void study() {
        System.out.println("Studying...");
    }
}