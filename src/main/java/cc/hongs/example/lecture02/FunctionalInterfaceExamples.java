package cc.hongs.example.lecture02;

import java.util.function.Function;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {
        final Function<String, Integer> toInt = s -> Integer.parseInt(s);
        final Integer number = toInt.apply("2");
        System.out.println(number);

        final Function<Integer, Integer> identity = Function.identity();
    }
}
