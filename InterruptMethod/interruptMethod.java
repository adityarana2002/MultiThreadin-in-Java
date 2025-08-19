package InterruptMethod;

public class interruptMethod extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running");
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("Thread was interrupted");
        }
    }

    public static void main(String[] args) {
        interruptMethod thread = new interruptMethod();
        thread.start();
        thread.interrupt(); // Interrupting the thread
       
    }

}
