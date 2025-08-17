package InfineThread;

public class mainMethod {
    public static void main(String[] args) {
    
        infiniteThread world = new infiniteThread();
        world.start();
    for(; ;){
        System.out.println("Hello");
    }
 
    }
}  
    

