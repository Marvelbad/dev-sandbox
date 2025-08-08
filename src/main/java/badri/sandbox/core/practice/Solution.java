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
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {

            }
        }
    }

    ThreadGroup group = new ThreadGroup("firstGroup");
    Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

    ThreadGroup group2 = new ThreadGroup("secondGroup");
    Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());


    private static void emulateThreadFactory() {
        
    }
}