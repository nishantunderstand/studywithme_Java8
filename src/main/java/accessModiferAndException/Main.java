package accessModiferAndException;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("====== Parent  ======");
        Parent p = new Parent();
        p.test();

        System.out.println("====== Child  ======");
        Child c  = new Child();
        c.test();

        System.out.println("====== Parent-Child  ======");
        Parent pc = new Child();
        pc.test();
    }
}