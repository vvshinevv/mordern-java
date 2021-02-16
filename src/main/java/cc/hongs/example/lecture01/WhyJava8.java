package cc.hongs.example.lecture01;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8 {

    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final String result = numbers.stream()
                .map(String::valueOf)
                .collect(joining(" : "));

        System.out.println(result);
    }
}
