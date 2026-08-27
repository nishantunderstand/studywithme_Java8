package _covariant;

class Animal {
Animal createAnimal() {
System.out.println("Animal Class");
return new Animal();
}
}

package _covariant;

class Dog extends Animal {

    // Valid
/*
@Override
Animal createAnimal() {
System.out.println("Dog Class ");
return new Animal();
}
*/

/*

    @Override
    Animal createAnimal() {
        System.out.println("Dog is a return type");
        return new Dog();
    }
*/
// Dog IS-A Animal
// We Can use it Interchange



    @Override
    Dog createAnimal() {
        System.out.println("Dog is a return type");
        return new Dog();
    }

}


package _covariant;

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


