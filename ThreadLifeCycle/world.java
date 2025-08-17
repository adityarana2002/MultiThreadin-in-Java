package ThreadLifeCycle;

public class world extends Thread {
    @Override
    public void run() {
        for(;;){
        System.out.println("Thread is running");
        }
    }
}