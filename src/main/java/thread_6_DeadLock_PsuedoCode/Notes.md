Dead Lock Code

synchronized(lockA){
synchronized(lockB){}
}

synchronized(lockB){
synchronized(lockA){}
}

1. Synchronzied Method
class Counter {
 public synchronized void increment() {
        count++;
    }
}

2. Synchronized Block

public void increment() {
    // Non-critical code
    synchronized(this) {
        count++;
    }
    // Non-critical code
}