package badri.sandbox.core.practice;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public static void main(String[] args) throws Exception {
        class EmulatorThreadFactory implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = () -> System.out.println(Thread.currentThread().getName());
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {
        private static AtomicInteger factoryNumber = new AtomicInteger(1);
        private AtomicInteger threadNumber = new AtomicInteger(1);
        private ThreadGroup threadGroup;

        private String format;

        public AmigoThreadFactory() {
            threadGroup = Thread.currentThread().getThreadGroup();
            format = String.format("%s-pool-%s-thread-", threadGroup.getName(), factoryNumber.getAndIncrement());
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, format + threadNumber.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(Thread.NORM_PRIORITY);
            return thread;
        }
    }
}