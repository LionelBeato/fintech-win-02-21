package com.tts.day4.bigo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class TestBase {

    @Rule
    public TestName name = new TestName();

    protected long nSize;

    private Instant startTime;

    private Instant finishTime;

    protected Random randam = new Random();

    protected String filename;

    protected static final List<Object[]> TEST_SIZE_PARAMETER = Arrays
            .asList(new Object[][] { { 10 }, { 200 }, { 300 }, { 500 }, { 800 }, { 1000 }, { 2000 }, { 3000 }, { 4000 },
                    { 5000 }, { 6000 }, { 7000 }, { 8000 }, { 9000 }, { 10000 }, { 11000 }, { 12000 }, { 13000 },
                    { 14000 }, { 15000 }, { 16000 }, { 17000 }, { 18000 }, { 19000 }, { 20000 } });


    @After
    public void cleanup() {
        finishTime = Instant.now();
        long totalTimeInNs = Duration.between(startTime, finishTime).toNanos();

        System.out.printf("\t%s with nSize =%d completed in %d ns\n", name.getMethodName(), nSize, totalTimeInNs);
        if (totalTimeInNs > 0) {
            String line = nSize + "," + totalTimeInNs + "\n";

            writeFile(filename, line);
        }
    }

    @Before
    public void setup() {
        startTime = Instant.now();
    }

    protected int[] setArray(long arraySize) {
        int nSize = (int) arraySize;

        int[] items = new int[nSize];
        for (int i = 0; i < nSize; i++) {
            items[i] = randam.nextInt(10000);
        }
        return items;
    }

    private void writeFile(String filename, String content) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(content);
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

}