package java8_CustomFunctionalInterface_2;

// @functionalInterface // INVALID
@FunctionalInterface
interface IWorkable{
    // void abstract work(); // INVALID
    // @FunctionalInterace // INVALID Appplicable to Interface
    // void abstract work(); // INVALID

    abstract void work();

}

class Work implements IWorkable{
    @Override
    // Ovveride // INVALID
    // @override // INVALID
    public void work(){
       System.out.println("I am Working");
    }
}

public class Main {
    public static void main(String[] args) {
        IWorkable iwork = new Work();
        iwork.work();


        Work iwork2 = new Work();
        iwork2.work();
    }
}
