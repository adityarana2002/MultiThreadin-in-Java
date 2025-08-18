public class priorityMethod extends Thread{
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "- Priority :" +Thread.currentThread().getPriority() + "Count : " + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        priorityMethod t1 = new priorityMethod();
        t1.start();
    }
}
