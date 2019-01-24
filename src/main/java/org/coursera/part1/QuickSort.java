package org.coursera.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> input) {
        if (input.isEmpty()) {
            return input;
        }
        int elementToCompare = input.get(0);
        if (input.size() == 1) {
            return Arrays.asList(elementToCompare);
        }

        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        int count = 1;
        while (count < input.size()) {
            Integer currentEle = input.get(count);
            if (currentEle < elementToCompare) {
                smaller.add(currentEle);
            } else {
                larger.add(currentEle);
            }
            count++;
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(sort(smaller));
        result.add(elementToCompare);
        result.addAll(sort(larger));
        System.out.println("output" + result);
        return result;

    }
}
