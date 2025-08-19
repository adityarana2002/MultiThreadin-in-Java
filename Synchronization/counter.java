package Synchronization;

public class counter {
    private int count =0;
    public synchronized void increment(){ // synchronized method to ensure thread safety
        // Only one thread can execute this method at a time
        count++;
    }

    public int getCount(){
        return count;
    }
}
