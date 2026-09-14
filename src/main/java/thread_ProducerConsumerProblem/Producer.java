package thread_ProducerConsumerProblem;

public class Producer {

    public void produce(Object lock) {
        synchronized (lock) {
            System.out.println("Producer: Producing item");
            lock.notify();
        }
    }
}