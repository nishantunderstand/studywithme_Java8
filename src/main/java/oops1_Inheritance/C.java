package oops1_Inheritance;

/**
 * Created : 2026-08-11 17:09:42
 */
public class C implements A,B {

    @Override
    public void show() {
        //A.super.show(); // Calling Show Method A
        B.super.show(); // Calling Show Method B
    }
}
