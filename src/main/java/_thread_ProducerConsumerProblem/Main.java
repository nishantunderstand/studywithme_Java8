package _thread_ProducerConsumerProblem;

public class Main {

    public static void main(String[] args) {

        Object lock = new Object();

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Thread t1 = new Thread(() -> consumer.consume(lock));
        Thread t2 = new Thread(() -> producer.produce(lock));

        t1.start();
        t2.start();
    }
}