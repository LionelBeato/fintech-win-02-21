package com.tts.day4.bigo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ConstantTimeAlgorithmTest extends TestBase {

    @Parameterized.Parameters
    public static Collection input() {
        return TEST_SIZE_PARAMETER;
    }

    private ConstantTimeAlgorithm testClass;

    public ConstantTimeAlgorithmTest(long nSize) {
        super();
        this.nSize = nSize;
    }

    @Before
    public void setup() {
        testClass = new ConstantTimeAlgorithm();
        this.filename = FileNameConstants.CONSTANT_TIME;
        super.setup();
    }

    @Test
    public void sumOfArithmeticSeries_via_formula() {
        BigInteger total = testClass.sumOfArithmeticSeries_via_formula(nSize);
        System.out.println("Sum of 1.." + nSize + " = " + total.longValue());
    }
}
