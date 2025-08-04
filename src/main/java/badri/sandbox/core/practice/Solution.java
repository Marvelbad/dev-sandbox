package badri.sandbox.core.practice;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            Callable<String> task = () -> {
                int sleepTime = 1000 + (int) (Math.random() * 2000);
                Thread.sleep(sleepTime);
                String result = "Task " + taskNumber + " finished at " + LocalTime.now().withNano(0);
                return result;
            };
            futures.add(executorService.submit(task));
        }

        boolean allDone = false;
        while (!allDone) {
            allDone = true;
            for (Future<String> f : futures) {
                if (!f.isDone()) {
                    allDone = false;
                    break;
                }
            }
            System.out.println("Main is working...");
            Thread.sleep(500);
        }
        System.out.println("\n--- Results ---");
        for (Future<String> f : futures) {
            System.out.println(f.get());
        }
        executorService.shutdown();
    }
}