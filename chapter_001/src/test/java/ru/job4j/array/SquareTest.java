package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();

        int[] expected = {0, 1, 4, 9, 16};
        int[] result = square.calculate(5);
        assertThat(result, is(expected));
    }
}
