package badri.sandbox.core.practice;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Map<String, Integer>> outerMap = new HashMap<>();
        int lineNumber = 1;
        while (true) {
            String str = console.readLine();
            if (str.isBlank() || str.equals("end")) break;

            Map<String, Integer> innerMap = outerMap.getOrDefault(lineNumber, new HashMap<>());
            String[] parts = str.split(" ");
            for (String part : parts) {
                if (part.matches("[a-zA-Zа-яА-Я0-9]+")) {
                    innerMap.put(part, innerMap.getOrDefault(part, 0) + 1);
                }
            }
            outerMap.put(lineNumber, innerMap);
            lineNumber++;
        }
        for (Map.Entry<Integer, Map<String, Integer>> entry : outerMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue().toString());
        }
    }
}