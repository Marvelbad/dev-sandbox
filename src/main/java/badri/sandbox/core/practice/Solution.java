package badri.sandbox.core.practice;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> task = () -> {
            int number = 5;
            return number * number;
        };

        Future<Integer> future = executorService.submit(task);
        Integer result = future.get();

        System.out.println("Result: " + result);
        executorService.shutdown();
    }
}