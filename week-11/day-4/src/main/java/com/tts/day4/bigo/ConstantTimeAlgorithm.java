package com.tts.day4.bigo;

import java.math.BigInteger;

public class ConstantTimeAlgorithm {

    /**
     *
     * O(1) - Calculate the sum from 1 to N via arithmetic series formula
     */
    public BigInteger sumOfArithmeticSeries_via_formula(long n) {
        return BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).divide(BigInteger.valueOf(2));
    }

}
