package Synchronization;

public class MyThread  extends Thread{

        private counter counter;
        public MyThread(counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
        for(int i=0;i<1000;i++){
            counter.increment();
        }
        }

}