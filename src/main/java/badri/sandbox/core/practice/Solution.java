package badri.sandbox.core.practice;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("a", 1,
                "b", 2,
                "c", 3,
                "d", 4,
                "e", 5
        );

        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
