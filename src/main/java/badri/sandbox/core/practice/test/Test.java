package badri.sandbox.core.practice.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(":", "[", "]");
        stringJoiner.add("George").add("Sally").add("Fred");
        String result = stringJoiner.toString();
        System.out.println(result);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        String separatedNumbers = numbers.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(separatedNumbers);
    }
}
