package java_0912;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:10:45
 **/
public class ThreadDemo3 {
    static class MyRunnable implements  Runnable{
        @Override
        public void run(){
            System.out.println("I am Thread!");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
