package __thread_Interview_PrintOddEven_2_ThreadSafe_VerifyIt;


class PrintOddEven {
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread t1 = new Thread(() -> p.printOdd());
        Thread t2 = new Thread(() -> p.printEven());
        t1.start();
        t2.start();
    }
}