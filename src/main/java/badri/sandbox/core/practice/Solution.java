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
        Runnable task = () -> System.out.println("Hello");
        new Thread(task).start();
    }
}