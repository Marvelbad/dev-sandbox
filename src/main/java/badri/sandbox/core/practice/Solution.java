package badri.sandbox.core.practice;

import lombok.var;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a text: ");
        String s = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(s))) {
            String line;
            HashMap<String, Integer> map = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                for (String word : parts) {
                    int count = map.getOrDefault(word, 0);
                    map.put(word, count + 1);
                }
            }
        }
    }
}
