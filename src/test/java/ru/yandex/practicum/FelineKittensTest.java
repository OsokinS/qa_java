package ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineKittensTest {

    private final int expected;

    public FelineKittensTest(int expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getDataForKittens() {
        return new Object[][]{
                {1},
                {2},
                {3},
        };
    }

    @Test
    public void checkKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(expected);
        Assert.assertEquals(expected, actual);
    }
}
