package RunnableThreadInterface;

public class test {
    public static void main(String[] args) {
        world w = new world();
        Thread thread = new Thread(w);
        thread.start();

        for(;;){
            System.out.println("Hello");
        }
    }
    
}
