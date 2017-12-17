package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {

    @Test
    public void whenArrayHasDuplicatesThenDropIt() {
        String[] input = {"Moskva", "Samara", "NNovgorod", "Moskva", "Piter", "Piter", "NNovgorod"};
        String[] expect = {"Moskva", "Samara", "NNovgorod", "Piter"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}