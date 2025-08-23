package ThreadLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitLock {
    private int balance =100;


    private final Lock lock  = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+"attempting to withdraw");
        try{
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if(balance>=amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+ "proceeding to withdraw");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+"Completed Withdrawal. Remainging balance :    "+ balance);
                    }catch(Exception e){

                    }
                    finally{
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + "Insufficient Balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName()+"could not get the lock");
            }
        }catch(Exception e){

        }
    }
}
