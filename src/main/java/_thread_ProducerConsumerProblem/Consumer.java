package _thread_ProducerConsumerProblem;

public class Consumer {

    public void consume(Object lock) {
        synchronized (lock) {
            try {
                System.out.println("Consumer: Waiting...");
                lock.wait();
                System.out.println("Consumer: Consuming item");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}