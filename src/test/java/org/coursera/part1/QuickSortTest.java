package org.coursera.part1;

import static junit.framework.TestCase.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class QuickSortTest {

    private QuickSort quickSort = new QuickSort();
    @Test
    public void test() {
        List<Integer> input  = Arrays.asList(1,5,6,2,7);
        List<Integer> output = quickSort.sort(input);
        assertEquals(Arrays.asList(1,2,5,6,7), output);

    }

}
