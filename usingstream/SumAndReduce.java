package com.javastream.usingstream;

import java.util.List;

public class SumAndReduce {
    public static int oldVersionCalculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    /*
    It's coming integer list as parameter. We need to add the whole variable into the integer list. And after that we
    should return sum of the numbers.
    */
    public static int calculate(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer::sum) // reduce((number, sum) -> number + sum)
                .orElse(0);
    }
}
