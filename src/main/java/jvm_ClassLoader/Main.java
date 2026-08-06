package jvm_ClassLoader;

public class Main {
    public static void main(String[] args) {

        System.out.println("String  : " + String.class.getClassLoader());
        System.out.println("Main    : " + Main.class.getClassLoader());
        System.out.println("Student : " + Student.class.getClassLoader());


        ClassLoader studentLoader = Student.class.getClassLoader();

        System.out.println("Student Loader : " + studentLoader);
        System.out.println("Parent         : " + studentLoader.getParent());
        System.out.println("Grand Parent   : " + studentLoader.getParent().getParent());
    }
}