package com.oreilly;

import java.util.List;

public class NumberCollection {
    private final List<Integer> numbers;

    public NumberCollection(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @SuppressWarnings("ForLoopReplaceableByForEach")
    public int getTotalUsingForLoop() {
        int total = 0;
        int count = numbers.size();
        for (int i = 0; i < count; i++) {
            total += numbers.get(i);
        }
        return total;
    }

    public int getTotalUsingForEach() {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public int getTotalUsingStream() {
        return numbers.stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
