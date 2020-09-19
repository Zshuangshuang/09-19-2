package java_0912;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:10:47
 **/
public class ThreadDemo4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am Thread!");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
