package cn.huang.method;

/*
 * 线程中断：
 *   判断线程是否被中断：public boolean isInterrupted()
 *   中断线程执行:public void interrupt()
 * */
public class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("我需要睡觉补充精力****");
            try {
                Thread.sleep(10000);//预计准备休眠10秒
                System.out.println("感觉精力充沛啦！");
            } catch (InterruptedException e) {
                System.out.println("线程被中断了0.0");
            }
        });
        thread.start();//开始睡觉
        Thread.sleep(1000);
        if (!thread.isInterrupted()) {//该线程中断了吗？
            System.out.println("当前线程未中断--，开始中断线程");
            thread.interrupt();
        }
    }
}
