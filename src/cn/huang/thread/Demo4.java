package cn.huang.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//使用Callable实现多线程处理
class MyThreadE implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程执行：" + i);
        }
        return "线程执行完毕";
    }
}

public class Demo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyThreadE());
        new Thread(task).start();
        System.out.println("线程返回数据" + task.get());
    }
}
/*
* 面试题：请解释Runnable与Callable的区别？
* 第一：Runnable是在JDk1.0的时候提出的多线程的实现接口，而Callable实在JDK1.5之后提出的；
* 第二：java.lang.Runnable接口中只提供一个run()方法,并且没有返回值，
* 第三：java.util.concurrent.Callable接口提供有call()方法,可以有返回值；
* */
