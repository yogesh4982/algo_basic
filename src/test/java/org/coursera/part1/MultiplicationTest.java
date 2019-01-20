package org.coursera.part1;

import static junit.framework.TestCase.assertEquals;

import org.coursera.part1.Multiplication.Type;
import org.junit.Test;

public class MultiplicationTest {

    private Multiplication multiplication = new Multiplication();


    @Test
    public void testLength() {
        int result = multiplication.getLength(5555);
        assertEquals(4, result);

        result = multiplication.getLength(5);
        assertEquals(1, result);

        result = multiplication.getLength(0);
        assertEquals(1, result);
    }
    @Test
    public void testExtractFirstHalf() {
        int result = multiplication.extractFirstHalf(543, 3);
        assertEquals(54, result);

        result = multiplication.extractFirstHalf(54, 2);
        assertEquals(5, result);

        result = multiplication.extractFirstHalf(5, 1);
        assertEquals(5, result);
    }

    @Test
    public void testExtractSecondHalf() {
        int result = multiplication.extractSecondHalf(543,3);
        assertEquals(3, result);

        result = multiplication.extractSecondHalf(54, 2);
        assertEquals(4, result);

        result = multiplication.extractSecondHalf(5, 1);
        assertEquals(0, result);
    }

    @Test
    public void testDivideNConquer() {

        int result = multiplication.divideNConquer(12,5);
        assertEquals(60, result);

        result = multiplication.divideNConquer(12,12);
        assertEquals(144, result);

        result = multiplication.divideNConquer(123,12);
        assertEquals(1476, result);

        result = multiplication.divideNConquer(1211100,123);
        assertEquals(148965300, result);
    }

    @Test
    public void testKaratSuba() {
      int result = multiplication.karatsuba(12,12);
        assertEquals(144, result);

        result = multiplication.karatsuba(123,120);
        assertEquals(14760, result);

        result = multiplication.karatsuba(120,123);
        assertEquals(14760, result);

        result = multiplication.karatsuba(12000,12300);
        assertEquals(1476000, result/100);
    }

    @Test
    public void testMultiply() {
        int result = multiplication.multiply(-12,12, Type.DNC);
        assertEquals(-144, result);

        result = multiplication.multiply(-12,-12, Type.DNC);
        assertEquals(144, result);

        result = multiplication.multiply(123,12, Type.KARATSUBA);
        assertEquals(1476, result);

        result = multiplication.multiply(12,-123,  Type.KARATSUBA);
        assertEquals(-1476, result);

        result = multiplication.multiply(121,12301, Type.KARATSUBA);
        assertEquals(1488421, result);
    }


}
