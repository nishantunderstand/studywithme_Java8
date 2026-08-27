package _covariant;

class Dog extends Animal {

    // Valid

// OPTION 1: Same return type + return Animal
//      This is NORMAL METHOD OVERRIDING.

/*
    @Override
    Animal createAnimal() {
        System.out.println("Dog Class ");
        return new Animal();
    }
*/


    //      OPTION 2: Same declared return type + return Dog
    //      This is ALSO normal method overriding.
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
    Dog createAnimal() { // Return type changed from Animal to Dog

        System.out.println("Dog is a return type");

        return new Dog(); // Returning a Dog object
    }

// Parent method return type: Animal
// Child method return type : Dog

// Dog IS-A Animal

// Since Dog is a subclass of Animal,
// Java allows this change in the overridden method.

// This is called Covariant Return Type.
}