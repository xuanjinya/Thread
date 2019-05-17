package cn.huang.thread;

class MyThreadB implements Runnable {
    private String title;

    public MyThreadB(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + "运行：" + i);
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThreadB("线程对象A"));
        Thread threadB = new Thread(new MyThreadB("线程对象B"));
        Thread threadC = new Thread(new MyThreadB("线程对象C"));
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
