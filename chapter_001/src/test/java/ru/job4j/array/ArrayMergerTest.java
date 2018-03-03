package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayMergerTest {
    @Test
    public void whenSortNewArrayWith2Arrays() {
        ArrayMerger arrayMerger = new ArrayMerger();
        int[] firstArray = {1, 9, 4, 5};
        int[] secondArray = {4, 3, 0, 7, 8, 2, 6};
        int[] result = arrayMerger.mergerWithSort(firstArray, secondArray);
        int[] expected = {0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expected));
    }
}