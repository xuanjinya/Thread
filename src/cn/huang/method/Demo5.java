package cn.huang.method;

/*
 * 线程的礼让操作
 * */
public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0) {
                    Thread.yield();//线程礼让
                    System.out.println("---玩耍的线程礼让执行---");
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
