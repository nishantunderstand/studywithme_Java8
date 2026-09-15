package __thread_Interview_PrintOddEven_3;

class Printer {
    private int cnt = 0;

//    public synchronized void printOdd(){
//        while(cnt<=10){
//            while(cnt%2==1){
//
//            }
//        }
//    }
    public synchronized void printEven(){
        while(cnt<=10){
            if(cnt%2==0){
                System.out.println("Thread 2 : "+ cnt++);
            }
        }
    }
}

