package cn.huang.thread;

//利用卖票程序实现多个线程的资源的并发访问。
class MyThreadD implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {//线程的主题方法
        for (int i = 0; i < 100; i++) {
            if (this.ticket > 0) {
                System.out.println("卖票，ticket=" + this.ticket--);
            }

        }

    }
}

public class Demo3 {
    public static void main(String[] args) {
        MyThreadD mt = new MyThreadD();
        new Thread(mt).start(); //第一个线程启动
        new Thread(mt).start(); //第二个线程启动
        new Thread(mt).start(); //第三个线程启动

    }
}
