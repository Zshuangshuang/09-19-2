package java_0912;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-19
 * Time:10:36
 **/
public class ThreadDemo2 {
    private static long count = 9_9999_9999;
    public static void main(String[] args) {
        //使用匿名内部类来分别用单线程和多线程实现一个较大数字循环相加
        serial();//单线程
        parallel();//多线程
    }
    private static void serial(){
        long beg = System.currentTimeMillis();//用时间戳来记录开始时间
        int a = 0;
        for (int i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b++;
        }
       long end = System.currentTimeMillis(); //用时间戳来记录结束时间
        System.out.println("串行时间："+(end-beg)+" ms");
    }
    private static void parallel(){
        long beg = System.currentTimeMillis();//用时间戳来记录开始时间
        Thread t1 = new Thread(){
            @Override
         public void run(){
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a++;
                }
         }

        };
        Thread t2 = new Thread(){
            public void run(){
                int b = 0;
                for (int i = 0; i < count; i++) {
                    b++;
                }
            }

        };
        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
        try{
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis(); //用时间戳来记录结束时间
        System.out.println("并行时间："+(end-beg)+" ms");
    }
}
