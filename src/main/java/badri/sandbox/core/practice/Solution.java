package badri.sandbox.core.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Starting task " + taskNumber + ": " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finished task " + taskNumber + ": " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}