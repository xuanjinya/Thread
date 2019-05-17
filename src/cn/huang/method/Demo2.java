package cn.huang.method;

public class Demo2 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            //产生5个线程对象
            new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--x = " + i);
                    try {
                        Thread.sleep(1000);//线程休眠，休眠结束之后，自动恢复执行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "线程对象-" + x).start();
        }
    }
}
