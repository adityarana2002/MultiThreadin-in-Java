package RunnableThreadInterface;

public class world implements Runnable {
    @Override
    public void run() {
        for(;;){
        System.out.println("World");
        }
    }
}
