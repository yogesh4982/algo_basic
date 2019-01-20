package org.coursera.part1;

import java.util.Objects;

public class Multiplication {

    public int divideNConquer(int a, int b) {
        int aLength = getLength(a);
        int bLength = getLength(b);
        if (aLength == 1 && bLength == 1) {
            return a * b;
        } else {
            int aFirstHalf = extractFirstHalf(a, aLength);
            int aSecondHalf = extractSecondHalf(a, aLength);

            int bFirstHalf = extractFirstHalf(b, bLength);
            int bSecondHalf = extractSecondHalf(b, bLength);
            return divideNConquer(aFirstHalf, bFirstHalf) * power10(aLength /2 + bLength / 2) +
                divideNConquer(aFirstHalf, bSecondHalf) * power10(aLength / 2) +
                divideNConquer(aSecondHalf, bFirstHalf) * power10(bLength / 2) +
                divideNConquer(aSecondHalf, bSecondHalf);
        }

    }

    public int karatsuba(int a, int b) {
        int aLength = getLength(a);
        int bLength = getLength(b);
        Objects.equals(aLength, bLength);

        if (aLength == 1 && bLength == 1) {
            return a * b;
        } else {
            int aFirstHalf = extractFirstHalf(a, aLength);
            int aSecondHalf = extractSecondHalf(a, aLength);

            int bFirstHalf = extractFirstHalf(b, bLength);
            int bSecondHalf = extractSecondHalf(b, bLength);

            int ac = karatsuba(aFirstHalf, bFirstHalf);
            int bd = karatsuba(aSecondHalf, bSecondHalf);
            int a_Plus_b_Mul_c_Plus_d = karatsuba(aFirstHalf + aSecondHalf, bFirstHalf + bSecondHalf);
            int ad_Plus_bc = a_Plus_b_Mul_c_Plus_d - ac - bd;
            return ac * power10(aLength/2 + bLength/2) + ad_Plus_bc * power10(aLength / 2) + bd;

        }
    }

    protected int extractFirstHalf(int a, int length) {
        return a / power10(length / 2);
    }

    protected int extractSecondHalf(int a, int length) {

        return a % power10(length / 2);
    }

    protected int getLength(int a) {
        if (a == 0) {
            return 1;
        }
        return (int) Math.log10(a) + 1;
    }

    protected int power10(int power) {
        return (int) Math.pow(10, power);
    }
}