package __thread_Interview_PrintOddEven_2_ThreadSafe_VerifyIt;

class Printer {
    private int cnt = 0;

    public synchronized void printOdd(){
        while(cnt<=10){
            if(cnt%2==1){
                System.out.println("Thread 1 : "+ cnt++);
            }
        }
    }
    public synchronized void printEven(){
        while(cnt<=10){
            if(cnt%2==0){
                System.out.println("Thread 2 : "+ cnt++);
            }
        }
    }
}

