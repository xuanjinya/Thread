package cn.huang.thread;

class MyThreadC implements Runnable {
    private String title;

    public MyThreadC(String title) {
        this.title = title;
    }

    @Override
    public void run() {//线程的主题方法
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + "运行，x=" + i);
        }

    }
}

//由于实现了Runnable接口对象，所以此时线程主体类上九不再有单继承局限，那么这样的设计才是一个标准型的设计，JDK8之后，可以使用Lambda表达是实现多线程定义
public class Demo2 {
    public static void main(String[] args) {
        /*Thread threadA = new Thread(new MyThreadC("线程对象A"));
        Thread threadB = new Thread(new MyThreadC("线程对象B"));
        Thread threadC = new Thread(new MyThreadC("线程对象C"));
        threadA.start();
        threadB.start();
        threadC.start();*/

        for (int i = 0; i < 3; i++) {
            String title = "线程对象" + i;
            Runnable run = () -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println(title + "运行，x=" + j);
                }
            };
            new Thread(run).start();
        }
    }
}
