package java_0912;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:10:48
 **/
public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("我是一个新线程");
        });
        thread.start();
    }
}
