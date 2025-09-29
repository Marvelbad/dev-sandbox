package badri.sandbox.core.practice;


import java.util.concurrent.ExecutorService;

public class Solution {
    public static void main(String[] args) {
        countDigits();

    }

    public static void countDigits() {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
