package ThreadLocks;

public class Main {
    public static void main(String[] args) {
        ExplicitLock BankAccount  = new ExplicitLock();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                BankAccount.withdraw(50);
            }
        };
        Thread t1 = new Thread(task , "Customer 1");
        Thread t2 = new Thread(task , "Customer 2");
        t1.start();
        t2.start();
        System.out.println("Hello there");
    }
}
