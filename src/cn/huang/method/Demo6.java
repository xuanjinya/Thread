package cn.huang.method;

/*
 * 线程的优先级
 *   设置优先级：public final void setPriority(int newPriority)
 *   获取优先级: public final int getPriority().
 *   在进行优先级的定义的时候都是通过int的数字来定义的
 *   最高优先级：public static final int MAX_PRIORITY 10
 *   中等优先级：public static final int NORM_PRIORITY 5
 *   最低优先级：public static final int MIN_PRIORITY 1
 * */
public class Demo6 {
    public static void main(String[] args) {
        Runnable run = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "执行，i=" + i);
            }
        };
        Thread threadA = new Thread(run, "线程对象A");
        Thread threadB = new Thread(run, "线程对象B");
        Thread threadC = new Thread(run, "线程对象C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
