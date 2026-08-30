package covariantReturnType;

class Animal {
    Animal createAnimal() {
        System.out.println("Animal Class");
        return new Animal();
    }
}