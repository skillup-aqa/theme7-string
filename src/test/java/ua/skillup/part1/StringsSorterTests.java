package ua.skillup.part1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringsSorterTests {
    @Test
    public void testSort() {
        String [] strArray = {"c", "b", "a"};
        String [] expected = {"a", "b", "c"};
        Assert.assertEquals(StringsSorter.sort(strArray), expected);
    }

    @Test
    public void testSortEmptyArray() {
        String [] strArray = {};
        String [] expected = {};
        assertEquals(StringsSorter.sort(strArray), expected);
    }
}
