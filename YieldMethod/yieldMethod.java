package YieldMethod;

public class yieldMethod extends Thread {
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "is running ");
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        yieldMethod t1 = new yieldMethod();
        yieldMethod t2 = new yieldMethod();
        t1.start();
        t2.start();
    }
}
