package cn.huang.method;

/*
 * 线程的强制执行
 * */
public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();//1.获取主线程(霸道的线程)
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i == 3) {
                    try {
                        mainThread.join();//霸道的线程先执行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "执行 , i = " + i);
            }
        }, "玩耍");
        thread.start();
        for (int x = 0; x < 100; x++) {
            Thread.sleep(100);
            System.out.println("霸道的线程,x = " + x);
        }
    }
}
/*
 * 在进行强制执行线程的时候，一定需要先获取线程的对象，然后才能让它进行强制执行操作
 * */