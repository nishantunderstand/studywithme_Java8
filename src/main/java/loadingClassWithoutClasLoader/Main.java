package loadingClassWithoutClasLoader;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("====== Wednesday, August 26, 2026 1:40:51 AM ======\n");
        ClassLoader loader = Main.class.getClassLoader();
        System.out.println("Before loadClass");
        Class<?> clazz = loader.loadClass("loadingClassWithoutClasLoader.Student"); //<--
        System.out.println("After loadClass");

        System.out.println("\nClass Name:");
        System.out.println(clazz.getName());

        System.out.println("\nClass Methods:");

        for (Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }

        System.out.println("\nClass Interfaces:");

        for (Class<?> interfaceName : clazz.getInterfaces()) {
            System.out.println(interfaceName.getName());
        }

        System.out.println("\nDeclared Methods:");

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}

/**
 * getMethods vs getDeclaredMethods Differenence
 */