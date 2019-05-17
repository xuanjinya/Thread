package cn.huang.method;
//线程的命名与取得
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Demo1 {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        new Thread(mt, "线程A").start();
        new Thread(mt).start();
        new Thread(mt, "线程B").start();

    }
}
