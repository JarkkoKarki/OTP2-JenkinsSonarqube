package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void addNumbers() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        App.printNumbers(3);

        System.setOut(originalOut);

        String expected =
                "i = 1" + System.lineSeparator() +
                        "i = 2" + System.lineSeparator() +
                        "i = 3" + System.lineSeparator();

        Assert.assertEquals(expected, out.toString());
    }
}
