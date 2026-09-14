package java8_MarkerFunctionalInterface;

// Custom Marker Interface
interface IWorkable{

}

class Work implements IWorkable{

}

class Main {
    public static void main(String[] args) {
        IWorkable iwork = new Work();
        System.out.println("Marker Interface Implementation");
    }
}