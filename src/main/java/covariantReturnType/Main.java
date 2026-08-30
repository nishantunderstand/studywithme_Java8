package covariantReturnType;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== Thursday, August 27, 2026 1:41:36 AM ======");
        Animal a1 = new Animal();
        Animal a2 = a1.createAnimal();
        System.out.println(a2.getClass().getSimpleName());

        System.out.println("====== Thursday, August 27, 2026 1:38:28 AM ======");
        Dog d1 = new Dog();
        d1.createAnimal();
        System.out.println(d1.getClass().getSimpleName());

        System.out.println("====== Thursday, August 27, 2026 1:38:33 AM ======");
        Animal ad = new Dog();
        ad.createAnimal();
        System.out.println(ad.getClass().getSimpleName());

    }
}
