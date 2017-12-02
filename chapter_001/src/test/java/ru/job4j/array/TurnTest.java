package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
        Turn turn = new Turn();
        int[] numbers = new int[] {1, 9, 21, 7, 6, 87};
        int[] result = turn.back(numbers);
        int[] expected = new int[] {87, 6, 7, 21, 9, 1};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turn = new Turn();
        int[] numbers = new int[] {5, 44, 0, 7, 6};
        int[] result = turn.back(numbers);
        int[] expected = new int[] {6, 7, 0, 44, 5};
        assertThat(result, is(expected));
    }
}