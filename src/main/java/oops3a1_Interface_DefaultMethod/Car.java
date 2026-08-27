package oops3a1_Interface_DefaultMethod;

/**
 * Created : 2026-08-18 20:06:55
 */
public class Car implements Vehicle{

//    //Why am i getting Stack Overflow Error
//    @Override
//    public void start(){
//        start(); // Will it Work ??? Will Call Current Start Recursive
//        System.out.println("Car is Starting.....");
//    }


    @Override
    public void start(){
        Vehicle.super.start(); // Will it Work ???
        // Can you call vechile start method from main ?
        System.out.println("Car is Starting.....");
    }


}
