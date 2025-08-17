package ThreadLifeCycle;

public class MyThread extends Thread{
 
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join(); // <-- Main thread wait kar raha hai ki kaab aayga iska output then aane k baad next main thread state start ho jayga
        // then main thread start and simply terminated
        System.out.println(t1.getState());
        
    }
}
