package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenPointOnLineThenTrue() {
        //create of new point.
        Point a = new Point(1, 4);
        // execute method - is and get result;
        boolean rsl = a.is(2, 2);
        // assert result by excepted value.
        assertThat(rsl, is(true));
    }
}
