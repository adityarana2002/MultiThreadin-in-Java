package ThreadLifeCycle;

public class test {
    
    public static void main(String[] args) {
        world world = new world();  // new thread is created
        world.start(); // Runnable thread  --> chla nahi hai wait kar raha hai ki chl sakta hai this is runnable state
            // jab cpu ko time milega tab chlega run ho jayga 
            //Blocked/Waiting -->kuch access karna hai uske liye wait kar raha hai kisi dusre thread ka perform hone ka wait kar raha hai jbb vo chalega then me chaluga
        
        for(;;){
            System.out.println("Main thread is running ");
        }
        // Terminated --> jab thread ka run method khatam ho jata hai to thread terminate ho jata hai
    }
}
