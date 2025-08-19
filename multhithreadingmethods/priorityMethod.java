package multhithreadingmethods;

public class priorityMethod extends Thread{

    public priorityMethod(String name) {
        super(name);
        
    }
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            String a = " ";
            for(int j=0;j<100000;j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + "- Priority : " +Thread.currentThread().getPriority() + " Count : " + i);
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        priorityMethod t1 = new priorityMethod("Low Priority Thread");
        priorityMethod t2 = new priorityMethod("High Priority Thread");
        priorityMethod t3 = new priorityMethod("Normal Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
