package ThreadLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantExample {

    private final Lock lock  = new ReentrantLock();

// Reentrant lock ka matlab hai ki ek thread same lock ko multiple times acquire kar sakta hai bina deadlock ke
// Jaise ki agar ek method lock acquire karta hai aur wo method kisi aur method ko call karta hai jo same lock ko acquire karta hai to bhi deadlock nahi hoga
// Ye tab possible hai jab ek thread already lock hold kar raha hai to wo same lock ko dobara acquire kar sakta hai bina kisi issue ke
// Ye behavior synchronized blocks ke sath bhi hota hai
// Jaise ki agar ek synchronized method kisi aur synchronized method ko call karta hai to bhi deadlock nahi hota
// Reentrant locks ka use tab hota hai jab aapko zyada control chahiye locking mechanism pe jaise ki tryLock() method jo ki lock acquire karne ki koshish karta hai bina block kiye
// Ya phir aapko fairness chahiye locking mechanism me jisme threads ko lock milta hai unke wait time ke hisab se
// Reentrant locks me aapko zyada flexibility milti hai jaise ki aap lock ko interrupt kar sakte hai jab wo acquire karne ki koshish kar raha ho
    public void outerMethod(){
        lock.lock(); // <-- Ye lock reentrant hai use like synchronized block
        try{
        System.out.println("Outer method");
        innerMethod(); // <-- ye depend kar raha hai inner method pe jo same lock ko acquire kar raha hai
        }finally{
            lock.unlock();
        }
    }
// Dono method ek dusre pe depend kar rahe hai ...
    public void innerMethod(){
        lock.lock();   // <-- same lock ko dobara acquire kar raha hai to ye deadlock vaali situation ban jayge , 
        try{
            System.out.println("Inner method");
        }
        finally{
            lock.unlock();
        }
    }
        public static void main(String[] args) {
            ReenTrantExample example = new ReenTrantExample();
            example.outerMethod();
        }
}