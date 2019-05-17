package cn.huang.thread;

class MyThreadA extends Thread {
    private String title;

    public MyThreadA(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + "运行，x = " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThreadA("线程A").start();
        new MyThreadA("线程B").start();
        new MyThreadA("线程C").start();
    }
}
