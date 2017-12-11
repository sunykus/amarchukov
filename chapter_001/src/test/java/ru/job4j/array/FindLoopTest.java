package ru.job4j.array;

        import org.junit.Test;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void searchElement() {
        FindLoop findLoop = new FindLoop();
        int[] array = {1, 2, 4, 8, 9, -76};
        int el = -76;
        int expected = 1;
        int result = findLoop.indexOf(array, el);
        assertThat(result, is(expected));
    }

    @Test
    public void searchElement1() {
        FindLoop findLoop = new FindLoop();
        int[] array = {-4, 1, -74, 41, 9, 0};
        int el = 0;
        int expected = 5;
        int result = findLoop.indexOf(array, el);
        assertThat(result, is(expected));

    }
}