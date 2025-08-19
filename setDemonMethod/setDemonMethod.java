package setDemonMethod;

public class setDemonMethod  extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Hello World !");
        }
    }
    
    public static void main(String[] args) {
            setDemonMethod t1 =new setDemonMethod();
            t1.setDaemon(true);  // Setting the thread as a daemon thread 
            // Daemon threads are used to perform background tasks and do not prevent the JVM from exiting
            // When all user threads finish, the JVM will exit even if daemon threads are still running
            // Daemon threads are typically used for tasks like garbage collection, monitoring, etc.
            // If you don't set the thread as a daemon, it will be a user thread by default
            // User threads keep the JVM running until they finish, even if daemon threads are still running
            // Daemon threads are terminated abruptly when the JVM exits, so they should not be used for critical tasks that require completion
            // Daemon threads should not be used for tasks that require guaranteed completion, as they may not finish if the JVM exits
            
            t1.start();
            System.out.println("Main Thread is running");
    }
}
